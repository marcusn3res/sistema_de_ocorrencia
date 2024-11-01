package dao;

import java.sql.*;
import domain.Funcionario;

public class FuncionarioDao {

    public void inserir (Funcionario funcionario) throws Exception {
        String sql = "INSERT INTO funcionario (COD_FUNC, NOME_FUNC, EMAIL_FUNC) VALUES (?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, funcionario.getCod_func());
        stmt.setString(2, funcionario.getNome_func());
        stmt.setString(3, funcionario.getEmail_func());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}
