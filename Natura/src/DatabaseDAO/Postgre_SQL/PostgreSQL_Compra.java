/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDAO.Postgre_SQL;

import Clases.Cliente;
import Clases.Compra;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DatabaseDAO.DAO_Compra;

public class PostgreSQL_Compra implements DAO_Compra {
    
    final String INSERT = "INSERT INTO Compra(compra_fecha, compra_saldo, codCliente) VALUES (?, ?, ?)";                          
    final String UPDATE = "UPDATE Compra SET  compra_fecha= ?, compra_saldo= ?, codCliente= ? WHERE codCompra = ?";
    final String DELETE = "DELETE FROM Compra WHERE codCompra = ?";
    final String GETALL = "SELECT * FROM Compra WHERE status = 1"; 
    final String GETONE = "SELECT * FROM Compra WHERE codCompra = ?";
    final String GETBYCUSTOMER = "SELECT * FROM Compra WHERE codcliente = ? AND status = 1";
    final String ERR = "ERROR EN QUERY:DB";
    private final Connection conn;
    
    public PostgreSQL_Compra(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Compra a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setString  (1, a.getCompra_fecha());
            stat.setFloat   (2, a.getCompra_saldo());
            stat.setShort   (3, a.getCliente().getCodCliente());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en ALTA");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    @Override
    public void eliminar(Compra a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setShort(1,  a.getCodCompra());
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en ELIMINACION");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    @Override
    public void modificar(Compra a) {
        
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1,  a.getCompra_fecha());
            stat.setFloat(2,  a.getCompra_saldo());
            stat.setShort(3,  a.getCliente().getCodCliente());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en UPDATE");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        
    }
    
    private Compra convertir (ResultSet rs) throws SQLException {
        short      codCompra = rs.getShort ("codCompra");
        String     fecha = rs.getString("compra_fecha");
        float     saldo = rs.getFloat("compra_saldo");
        short      codCliente = rs.getShort ("codCliente");
        
        Cliente cliente = new Cliente(codCliente);
        ArrayList<Producto> prod = null;
        Compra compra = new Compra(codCompra, fecha, saldo, cliente, prod);
        return compra;
    }

    @Override
    public List<Compra> obtener_todos() {
        PreparedStatement stat;
        ResultSet rs;
        List<Compra> a = new ArrayList<>();
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery(); 
            while(rs.next()){
                a.add(convertir(rs));
            }
            rs.close();
            stat.close();

        }catch(SQLException ex){
            System.out.println("Fallo en Obtener_todos");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
      
    }

    @Override
    public Compra obtener_uno(Short id) {
        
        PreparedStatement stat;
        ResultSet rs;
        Compra a = null;
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setShort(1,id);
            rs = stat.executeQuery(); 
            if(rs.next()){
               a = convertir(rs); 
            } else{
                JOptionPane.showMessageDialog(null,"Resultado VACIO");
            }
            rs.close();
            stat.close();
        }catch(SQLException ex){
            System.out.println("Fallo en obtener 1");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
        
    }
    public Long lastid() {
        PreparedStatement stat;
        Long a = null;
        ResultSet rs;
        try{
            stat = conn.prepareStatement("SELECT LASTVAL()");
            rs = stat.executeQuery(); 
            if(rs.next()){
                a = rs.getLong(("lastval"));
            } else{
                JOptionPane.showMessageDialog(null,"Resultado VACIO");
            }
           
            stat.close();
            rs.close();
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return(a);
    }
    
    public List<Compra> obtener_por_cliente(Short codcliente) {
        
        PreparedStatement stat;
        ResultSet rs;
        List<Compra> a = new ArrayList<>();
        try{
            stat = conn.prepareStatement(GETBYCUSTOMER);
            stat.setShort(1,codcliente);
            rs = stat.executeQuery(); 
            while(rs.next()){
                a.add(convertir(rs));
            }
            rs.close();
            stat.close();

        }catch(SQLException ex){
            System.out.println("Fallo en Obtener_todos");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
        
    }
    
}
