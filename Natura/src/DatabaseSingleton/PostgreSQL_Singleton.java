/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQL_Singleton {

    private static PostgreSQL_Singleton instance;
    private Connection connection;
    final String url = "jdbc:postgresql://localhost:5433/Natura_DB";
    final String user = "postgres";
    final String pass = "1234";

    private PostgreSQL_Singleton() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static PostgreSQL_Singleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new PostgreSQL_Singleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new PostgreSQL_Singleton();
        }

        return instance;
    }
}