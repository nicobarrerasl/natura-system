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

    private static PostgreSQL_Singleton instance = null;
    private static Connection connection;
    private static final String URL = "jdbc:postgresql://localhost:5432/Natura_DB";
    private static final String USER = "postgres";
    private static final String PASS = "1234";

    private PostgreSQL_Singleton() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connection to PostgreSQL: ON");
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
        } 
        return instance;
    }
    public void disconnect(){
        try{
            connection.close();
            System.out.println("Connection to PostgreSQL: OFF");
        } catch (SQLException ex) {
            System.out.println("Connection to PostgreSQL: Failed /n " + ex.getMessage());
        }
        
    }
}