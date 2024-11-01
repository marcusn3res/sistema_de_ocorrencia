package dao;

import java.sql.*;
import domain.Professor;

public class ProfessorDao {

    public void inserir (Professor professor) throws Exception {
        String sql = "INSERT INTO professor (COD_ID, NOME_PROF, CPF, SEXO, AREA_ATUACAO) VALUES (?,?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, professor.getCod_id());
        stmt.setString(2, professor.getNome_prof());
        stmt.setString(3, professor.getCpf());
        stmt.setString(4, professor.getSexo());
        stmt.setString(5, professor.getArea_atuacao());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}