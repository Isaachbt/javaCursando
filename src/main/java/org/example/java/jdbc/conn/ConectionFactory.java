package org.example.java.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pessoa";
        String user = "root";
        String senha = "23*02*2003Su";
            return DriverManager.getConnection(url, user, senha);


    }
}
