package dao;

import java.sql.*;
import domain.Curso;

public class CursoDao {

    public void inserir (Curso curso) throws Exception {
        String sql = "INSERT INTO curso (COD_CURSO, SIGLA_CURSO, NOME) VALUES (?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, curso.getCod_curso());
        stmt.setString(2, curso.getSigla_curso());
        stmt.setString(3, curso.getNome());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}
