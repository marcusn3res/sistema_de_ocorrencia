package dao;

import java.sql.*;
import domain.Ocorrencia;

public class OcorrenciaDao {

    public void inserir (Ocorrencia ocorrencia) throws Exception {
        String sql = "INSERT INTO ocorrencia (COD_OCORRENCIA, DATA_OCORRENCIA, HORARIO, DESCRICAO, ALUNO, COD_FUNC, COD_ID) VALUES (?,?,?,?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, ocorrencia.getCod_ocorrencia());
        stmt.setDate(2, new java.sql.Date(ocorrencia.getData_ocorrencia().getTime()));
        stmt.setTime(3, new java.sql.Time(ocorrencia.getHorario().getTime()));
        stmt.setString(4, ocorrencia.getDescricao());
        stmt.setInt(5, ocorrencia.getAluno().getCod_mat());
        stmt.setInt(6, ocorrencia.getFuncionario().getCod_func());
        stmt.setInt(7, ocorrencia.getProfessor().getCod_id());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}


