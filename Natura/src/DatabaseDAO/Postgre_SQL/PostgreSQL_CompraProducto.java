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
    final String GETBYPURCHASE = "SELECT producto.codproducto,prod_cat,prod_linea,prod_nombre,prod_precio,cantidad\n" +
                                 "FROM compraproducto,producto\n" +
                                 "WHERE codcompra = ? AND compraproducto.codproducto = producto.codproducto";
    private Connection conn;
    public PostgreSQL_CompraProducto(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(CompraProducto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(INSERT)) {
            stat.setShort(1,    a.getCodCompra());
            stat.setInt  (2,    a.getCodProducto());
            stat.setInt  (3,    a.getCantidad());
            stat.executeUpdate();
        }
    }

    @Override
    public void eliminar(CompraProducto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DELETE)) {
            stat.setInt  (1,  a.getCodProducto());
            stat.setShort(2,  a.getCodCompra());
            stat.executeUpdate();
        }
    }

    @Override
    public void modificar(CompraProducto a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(UPDATE)) {
            stat.setShort  (1,    a.getCodCompra());
            stat.setInt    (2,    a.getCodProducto());
            stat.setInt    (3,    a.getCantidad());
            stat.setInt    (4,    a.getCodProducto());
            stat.setShort  (5,    a.getCodCompra());
            stat.executeUpdate();
        }
    }

    private CompraProducto convertir (ResultSet rs) throws SQLException {
        int   codprod =      rs.getInt("codProducto");
        short codcomp =      rs.getShort("codCompra");
        short cant =         rs.getShort("cantidad");

        CompraProducto compraprod = new CompraProducto(codcomp,codprod,cant);
        return compraprod;
    }
    private String[] convertir2 (ResultSet rs) throws SQLException {
        int    codprod =      rs.getInt("codProducto");
        String codcat =       rs.getString("prod_cat");
        String linea =        rs.getString("prod_linea");
        String nomb =         rs.getString("prod_nombre");
        float  price =        rs.getFloat("prod_precio");
        int    cant =         rs.getInt("cantidad");
        String[] r = {String.valueOf(codprod),codcat,linea,nomb,String.valueOf(price),String.valueOf(cant)};
        return r;
    }

    @Override
    public List<CompraProducto> obtener_todos() throws SQLException {
        List<CompraProducto> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETALL);
             ResultSet rs = stat.executeQuery()) {
            while(rs.next()){
                a.add(convertir(rs));
            }
        }
        return a;
    }

    public CompraProducto obtener_uno(int codprod,short codcomp) throws SQLException {
        CompraProducto a = null;
        try (PreparedStatement stat = conn.prepareStatement(GETONE)) {
            stat.setInt  (1,    codprod);
            stat.setShort(2,    codcomp);
            try (ResultSet rs = stat.executeQuery()) {
                if(rs.next()){
                   a = convertir(rs);
                } else{
                    JOptionPane.showMessageDialog(null,"Resultado VACIO");
                }
            }
        }
        return a;
    }

    @Override
    public CompraProducto obtener_uno(Short a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String[]> obtener_por_compra(Short codcompra) throws SQLException {
        List<String[]> a =new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETBYPURCHASE)) {
            stat.setShort(1,codcompra);
            try (ResultSet rs = stat.executeQuery()) {
                while(rs.next()){
                    a.add(convertir2(rs));
                }
            }
        }
        return a;
    }

}
