package dao;

import java.sql.*;
import domain.Responsavel;

public class ResponsavelDao {

    public void inserir (Responsavel responsavel) throws Exception {
        String sql = "INSERT INTO responsavel (COD_RESP, NOME_RESP, CPF, RG, PARENTESCO, TELEFONE, EMAIL) VALUES (?,?,?,?,?,?,?)";
        Connection conexao = ConexaoMySql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, responsavel.getCod_resp());
        stmt.setString(2, responsavel.getNome_resp());
        stmt.setString(3, responsavel.getCpf());
        stmt.setString(4, responsavel.getRg());
        stmt.setString(5, responsavel.getParentesco());        
        stmt.setString(6, responsavel.getTelefone());
        stmt.setString(7, responsavel.getEmail());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    }

}
