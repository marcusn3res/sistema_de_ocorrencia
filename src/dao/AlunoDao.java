package dao;

import domain.Aluno;
import java.sql.*;

public class AlunoDao {

    public void inserir (Aluno aluno) throws Exception {
        String sql = "INSERT INTO aluno (COD_MAT, NOME_ALUNO, CPF, RG, TELEFONE, DATA_NASC, SEXO, EMAIL, COD_SERIE, COD_RESP) VALUES (?,?,?,?,?,?,?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, aluno.getCod_mat());
        stmt.setString(2, aluno.getNome_aluno());
        stmt.setString(3, aluno.getCpf());
        stmt.setString(4, aluno.getRg());
        stmt.setString(5, aluno.getTelefone());
        stmt.setDate(6, new java.sql.Date(aluno.getData_nasc().getTime()));
        stmt.setString(7, aluno.getSexo());
        stmt.setString(8, aluno.getEmail());
        stmt.setInt(9, aluno.getSerie().getCod_serie());
        stmt.setInt(10, aluno.getResponsavel().getCod_resp());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }
}
