package dao;

import java.sql.*;
import domain.Serie;

public class SerieDao {

    public void inserir (Serie serie) throws Exception {
        String sql = "INSERT INTO serie (COD_SERIE, ANO_SERIE, TURMA, COD_CURSO) VALUES (?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, serie.getCod_serie());
        stmt.setInt(2, serie.getAno_serie());
        stmt.setString(3, serie.getTurma());
        stmt.setInt(4, serie.getCurso().getCod_curso());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}