package dao;

import java.sql.*;
import domain.Penalidade;

public class PenalidadeDao {

    public void inserir (Penalidade penalidade) throws Exception {
        String sql = "INSERT INTO ocorrencia (COD_PENAL, DURACAO, TIPO PENAL, DATA_APLICACAO, COD_OCORRENCIA, COD_FUNC) VALUES (?,?,?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, penalidade.getCod_penal());
        stmt.setString(2, penalidade.getDuracao());
        stmt.setDate(4, new java.sql.Date(penalidade.getData_aplicacao().getTime()));
        stmt.setString(3, penalidade.getTipo_penal());
        stmt.setInt(5, penalidade.getOcorrencia().getCod_ocorrencia());
        stmt.setInt(6, penalidade.getFuncionario().getCod_func());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();

    } 
}
