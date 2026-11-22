package DatabaseDAO.Postgre_SQL;

import Clases.Cliente;
import Clases.Pago;
import DatabaseDAO.DAO_Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostgreSQL_Pago implements DAO_Pago{

    final String INSERT = "INSERT INTO Pago(pago_fecha, pago_saldo, codCliente) VALUES (?, ?, ?)";
    final String UPDATE = "UPDATE Pago SET  pago_fecha= ?, pago_saldo= ?, codCliente= ? WHERE codPago = ?";
    final String DELETE = "UPDATE Pago SET status = 0 WHERE codPago = ?";
    final String GETALL = "SELECT * FROM Pago WHERE status = 1";
    final String GETONE = "SELECT * FROM Pago WHERE codPago = ? AND status = 1";
    final String GETBYCUSTOMER = "SELECT * FROM Pago WHERE codcliente = ? AND status = 1";
    private final Connection conn;
    public PostgreSQL_Pago(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Pago a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(INSERT)) {
            stat.setString(1,  a.getPago_fecha());
            stat.setFloat(2,  a.getPago_saldo());
            stat.setShort(3,  a.getCliente().getCodCliente());
            stat.executeUpdate();
        }
    }

    @Override
    public void eliminar(Pago a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DELETE)) {
            stat.setShort(1,  a.getCodPago().shortValue());
            stat.executeUpdate();
        }
    }

    @Override
    public void modificar(Pago a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(UPDATE)) {
            stat.setString  (1,  a.getPago_fecha());
            stat.setFloat   (2,  a.getPago_saldo());
            stat.setShort   (3,  a.getCliente().getCodCliente());
            stat.setShort   (4,  a.getCodPago().shortValue());
            stat.executeUpdate();
        }
    }

    private Pago convertir (ResultSet rs) throws SQLException {
        int      cod =     rs.getInt("codPago");
        String   fec =     rs.getString("pago_fecha");
        Float    sal =     rs.getFloat("pago_saldo");
        short    codC =    rs.getShort("codCliente");
        Cliente cliente = new Cliente(codC);
        Pago pago = new Pago(cod,fec,sal,cliente);
        return pago;
    }

    @Override
    public List<Pago> obtener_todos() throws SQLException {
        List<Pago> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETALL);
             ResultSet rs = stat.executeQuery()) {
            while(rs.next()){
                a.add(convertir(rs));
            }
        }
        return a;
    }

    @Override
    public Pago obtener_uno(Long id) throws SQLException {
        Pago a = null;
        try (PreparedStatement stat = conn.prepareStatement(GETONE)) {
            stat.setShort(1,id.shortValue());
            try (ResultSet rs = stat.executeQuery()) {
                if(rs.next()){
                   a = convertir(rs);
                } else{
                    JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Pago");
                }
            }
        }
        return a;
    }

    public List<Pago> obtener_por_cliente(Short codcliente) throws SQLException {
        List<Pago> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETBYCUSTOMER)) {
            stat.setShort(1,codcliente);
            try (ResultSet rs = stat.executeQuery()) {
                while(rs.next()){
                    a.add(convertir(rs));
                }
            }
        }
        return a;
    }

}
