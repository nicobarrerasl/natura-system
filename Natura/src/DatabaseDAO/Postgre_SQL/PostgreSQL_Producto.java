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
    // Descuenta stock en la base solo si alcanza; si no alcanza no actualiza ninguna fila.
    final String DESCONTAR_STOCK = "UPDATE Producto SET prod_cant = prod_cant - ? WHERE codProducto = ? AND status = 1 AND prod_cant >= ?";
    final String DELETE = "UPDATE Producto SET status = 0 WHERE codProducto = ?";
    final String GETALL = "SELECT * FROM Producto WHERE status = 1";
    final String GETONE = "SELECT * FROM Producto WHERE codProducto = ? AND status = 1";
    private Connection conn;
    public PostgreSQL_Producto(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Producto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(INSERT)) {
            stat.setInt(1,  a.getCodProducto());
            stat.setString(2,  a.getCategoria());
            stat.setString(3,  a.getLinea());
            stat.setString(4,  a.getNombre());
            stat.setFloat(5,  a.getPrecio());
            stat.setShort(6,  a.getCantidad());
            stat.executeUpdate();
        }
    }

    @Override
    public void eliminar(Producto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DELETE)) {
            stat.setInt(1,  a.getCodProducto());
            stat.executeUpdate();
        }
    }

    @Override
    public void modificar(Producto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(UPDATE)) {
            stat.setInt     (1,  a.getCodProducto());
            stat.setString  (2,  a.getCategoria());
            stat.setString  (3,  a.getLinea());
            stat.setString  (4,  a.getNombre());
            stat.setFloat   (5,  a.getPrecio());
            stat.setShort   (6,  a.getCantidad());
            stat.setInt     (7,  a.getCodProducto());
            stat.executeUpdate();
        }
    }

    /** Resta stock de un producto. Falla si el producto no existe o no hay stock suficiente. */
    public void descontar_stock(int codProducto, short cantidad) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DESCONTAR_STOCK)) {
            stat.setShort   (1,  cantidad);
            stat.setInt     (2,  codProducto);
            stat.setShort   (3,  cantidad);
            if (stat.executeUpdate() == 0) {
                throw new SQLException("No hay stock suficiente del producto " + codProducto);
            }
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
    public List<Producto> obtener_todos() throws SQLException {
        List<Producto> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETALL);
             ResultSet rs = stat.executeQuery()) {
            while(rs.next()){
                a.add(convertir(rs));
            }
        }
        return a;
    }

    @Override
    public Producto obtener_uno(Integer id) throws SQLException {
        Producto a = null;
        try (PreparedStatement stat = conn.prepareStatement(GETONE)) {
            stat.setInt(1,id);
            try (ResultSet rs = stat.executeQuery()) {
                if(rs.next()){
                   a = convertir(rs);
                } else{
                    JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Producto");
                }
            }
        }
        return a;
    }
}
