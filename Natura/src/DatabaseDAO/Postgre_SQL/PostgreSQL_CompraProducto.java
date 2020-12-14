package DatabaseDAO.Postgre_SQL;
import Clases.CompraProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DatabaseDAO.DAO_CompraProducto;

public class PostgreSQL_CompraProducto implements DAO_CompraProducto{
    
    final String INSERT = "INSERT INTO CompraProducto( codCompra, codProducto, cantidad) VALUES (?, ?, ?)";              // 3 ?  
    final String DELETE = "UPDATE CompraProducto SET status = 0 WHERE codProducto = ? AND codCompra = ?";
    final String UPDATE = "UPDATE CompraProducto SET  codCompra= ?, codProducto= ?, cantidad= ? WHERE codProducto = ? AND codCompra = ?"; // 5 ?
    final String GETALL = "SELECT * FROM CompraProducto WHERE status = 1"; 
    final String GETONE = "SELECT * FROM CompraProducto WHERE codProducto = ? AND codCompra = ? AND status = 1";
    final String ERR    = "ERROR EN QUERY:DB";
    private Connection conn;
    public PostgreSQL_CompraProducto(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(CompraProducto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setShort(1,    a.getCodCompra());
            stat.setInt  (2,    a.getCodProducto());
            stat.setInt  (3,    a.getCantidad());
            
            if(stat.executeUpdate()== 0){
                System.out.println(stat.getWarnings());// ERROR
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
    public void eliminar(CompraProducto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setInt  (1,  a.getCodProducto());
            stat.setShort(2,  a.getCodCompra());
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
    public void modificar(CompraProducto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setShort  (1,    a.getCodCompra());
            stat.setInt    (2,    a.getCodProducto());
            stat.setInt    (3,    a.getCantidad());
            stat.setInt    (4,    a.getCodProducto());
            stat.setShort  (5,    a.getCodCompra());
            
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

    private CompraProducto convertir (ResultSet rs) throws SQLException {
        int   codprod =      rs.getInt("codProducto");
        short codcomp =      rs.getShort("codProducto");
        short cant =         rs.getShort("cantidad");
        
        CompraProducto compraprod = new CompraProducto(codcomp,codprod,cant);
        return compraprod;
    }
    
    @Override
    public List<CompraProducto> obtener_todos() {
        PreparedStatement stat;
        ResultSet rs;
        List<CompraProducto> a = new ArrayList<>();
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

    public CompraProducto obtener_uno(int codprod,short codcomp) {
        PreparedStatement stat;
        ResultSet rs;
        CompraProducto a = null;
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setInt  (1,    codprod);
            stat.setShort(2,    codcomp);
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

    @Override
    public CompraProducto obtener_uno(Short a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
