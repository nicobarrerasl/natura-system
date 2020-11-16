/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natura;

import DatabaseSingleton.PostgreSQL_Singleton;
import Interfaces.Principal;
import java.sql.Connection;
import java.sql.SQLException;

public class Natura {
    
    public static void main(String[] args) {
        Principal p = new Principal();
        p.setVisible(true);
        
        try{
            PostgreSQL_Singleton databaseConnection = PostgreSQL_Singleton.getInstance();
            Connection con = databaseConnection.getConnection();
        }
        catch(SQLException ex){
            System.out.println("Conexion a la base de datos: ERROR:");
            System.out.println(ex.getMessage());
        }
    }

}
