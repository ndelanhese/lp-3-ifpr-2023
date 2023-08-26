package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    private static Connection conexao;

    private connection() throws Exception {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/ifsis";
            String usuario = "root";
            String senha = "Nhpd1906.";

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            conexao.setAutoCommit(true);

        } catch (Exception e) {
            throw e;
        }
    }

    public static Connection getConexao() throws Exception {
        if (conexao == null) {
            new connection();
        }

        return conexao;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(connection.getConexao());
        System.out.println(connection.getConexao());
    }
    
}
