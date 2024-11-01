package dao;

import java.sql.*;

public class ConexaoMySql {

    public static Connection getConexao() throws Exception{
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Ocorrencia",
            "marcus",
            "root123");
    }

}
