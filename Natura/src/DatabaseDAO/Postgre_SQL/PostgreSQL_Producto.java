package DatabaseDAO.Postgre_SQL;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DatabaseDAO.DAO_Producto;

public class PostgreSQL_Producto implements DAO_Producto{
    
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
            System.out.println("Fallo en ALTA Producto");
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
            System.out.println("Fallo en ELIMINACION Producto");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    @Override
    public void modificar(Producto a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setInt     (1,  a.getCodProducto());
            stat.setString  (2,  a.getCategoria());
            stat.setString  (3,  a.getLinea());
            stat.setString  (4,  a.getNombre());
            stat.setFloat   (5,  a.getPrecio());
            stat.setShort   (6,  a.getCantidad());
            stat.setInt     (7,  a.getCodProducto()); 
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en UPDATE Producto");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    private Producto convertir (ResultSet rs) throws SQLException {
        int      cod=      rs.getInt("codProducto");
        String   cat =     rs.getString("prod_cat");
        String   lin =     rs.getString("prod_linea");
        String   nom =     rs.getString("prod_nombre");
        Float    pre =     rs.getFloat("prod_precio");
        short    cant =    rs.getShort("prod_cant");
        
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
            System.out.println("Fallo en Obtener_todos Producto");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
    }

    @Override
    public Producto obtener_uno(Integer id) {
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
                JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Producto");
            }
            rs.close();
            stat.close();
        }catch(SQLException ex){
            System.out.println("Fallo en obtener 1 Producto");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
    }
}
