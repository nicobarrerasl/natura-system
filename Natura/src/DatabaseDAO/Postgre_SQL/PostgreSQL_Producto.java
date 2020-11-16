package DatabaseDAO.Postgre_SQL;
import Clases.Cliente;
import Clases.Producto;
import DatabaseDAO.productoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostgreSQL_Producto implements productoDAO{
    
    final String INSERT = "INSERT INTO Producto(codProducto, prod_cat, prod_linea, prod_nombre, prod_precio, prod_cant) VALUES (?, ?, ?, ?, ?, ?)";                          
    final String UPDATE = "UPDATE Producto SET  codProducto= ?, prod_cat= ?, prod_linea= ?, prod_nombre= ?, prod_precio= ?, prod_cant= ? WHERE codProducto = ?";
    final String DELETE = "UPDATE Producto SET status = 0 WHERE codProducto = ?";
    final String GETALL = "SELECT * FROM Producto WHERE status = 1"; 
    final String GETONE = "SELECT * FROM Producto WHERE codProducto = ? AND status = 1";
    final String ERR = "ERROR EN QUERY:DB";
    private Connection conn;
    public PostgreSQL_Producto(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Producto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1,  a.getCodProducto());
            stat.setString(2,  a.getCategoria());
            stat.setString(3,  a.getLinea());
            stat.setString(4,  a.getNombre());
            stat.setFloat(5,  a.getPrecio());
            stat.setShort(6,  a.getCantidad());
            
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
    public void eliminar(Producto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1,  a.getCodProducto());
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
    public void modificar(Producto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setInt(1,  a.getCodProducto());
            stat.setString  (2,  a.getCategoria());
            stat.setString(3,  a.getLinea());
            stat.setString  (4,  a.getNombre());
            stat.setFloat(5,  a.getPrecio());
            stat.setShort(6,  a.getCantidad());
            
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

    private Producto convertir (ResultSet rs) throws SQLException {
        int   cod=     rs.getInt("codProducto");
        String  cat =    rs.getString("prod_cat");
        String  lin =    rs.getString("prod_linea");
        String   nom =   rs.getString("prod_nombre");
        Float  pre =   rs.getFloat("prod_precio");
        short  cant =    rs.getShort("prod_cant");
        
        Producto producto = new Producto(cod,cat,lin,nom,pre,cant);
        return producto;
    }
    
    @Override
    public List<Producto> obtener_todos() {
        PreparedStatement stat;
        ResultSet rs;
        List<Producto> a = new ArrayList<>();
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

    public Producto obtener_uno(int id) {
        PreparedStatement stat;
        ResultSet rs;
        Producto a = null;
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setInt(1,id);
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
    public Producto obtener_uno(Short a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


    
}
