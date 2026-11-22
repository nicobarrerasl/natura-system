package DatabaseDAO.Postgre_SQL;
import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DatabaseDAO.DAO_Cliente;

public class PostgreSQL_Cliente implements DAO_Cliente{
    final String INSERT = "INSERT INTO Cliente(cliente_apellido, cliente_nombre, cliente_Fnac, cliente_tel, cliente_DV, cliente_ZV) VALUES (?, ?, ?, ?, ?, ?)";
    // El saldo no se toca desde aca: se mueve solo con SUMAR_SALDO, para no pisarlo con un valor viejo.
    final String UPDATE = "UPDATE Cliente SET  cliente_apellido= ?, cliente_nombre= ?, cliente_Fnac= ?, cliente_tel= ?, cliente_DV= ?, cliente_ZV= ? WHERE codCliente = ?";
    final String SUMAR_SALDO = "UPDATE Cliente SET cliente_saldo = cliente_saldo + ? WHERE codCliente = ? AND status = 1";
    final String DELETE = "UPDATE Cliente SET status = 0 WHERE codCliente = ?";
    final String GETALL = "SELECT * FROM Cliente WHERE status = 1";
    final String GETONE = "SELECT * FROM Cliente WHERE codCliente = ? AND status = 1";
    private final Connection conn;
    public PostgreSQL_Cliente(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Cliente a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(INSERT)) {
            stat.setString  (1,  a.getApellido()         );
            stat.setString  (2,  a.getNombre()           );
            stat.setString  (3,  a.getFechaNac()         );
            stat.setString  (4,  a.getTelefono()         );
            stat.setString  (5,  a.getDireccion()        );
            stat.setString  (6,  a.getZonaVivienda()     );
            stat.executeUpdate();
        }
    }

    @Override
    public void eliminar(Cliente a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DELETE)) {
            stat.setShort   (1,  a.getCodCliente());
            stat.executeUpdate();
        }
    }

    @Override
    public void modificar(Cliente a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(UPDATE)) {
            stat.setString  (1,  a.getApellido());
            stat.setString  (2,  a.getNombre());
            stat.setString  (3,  a.getFechaNac());
            stat.setString  (4,  a.getTelefono());
            stat.setString  (5,  a.getDireccion());
            stat.setString  (6,  a.getZonaVivienda());
            stat.setShort   (7,  a.getCodCliente());
            stat.executeUpdate();
        }
    }

    /** Suma (o resta, si es negativo) un importe al saldo actual del cliente, en la base. */
    public void sumar_saldo(short codCliente, float importe) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(SUMAR_SALDO)) {
            stat.setFloat   (1,  importe);
            stat.setShort   (2,  codCliente);
            if (stat.executeUpdate() == 0) {
                throw new SQLException("No existe el cliente " + codCliente);
            }
        }
    }

    private Cliente convertir (ResultSet rs) throws SQLException {
        short   cod=     rs.getShort ("codCliente");
        String  ape =    rs.getString("cliente_apellido");
        String  nom =    rs.getString("cliente_nombre");
        String  fnac =   rs.getString("cliente_fnac");
        String  tel =    rs.getString("cliente_tel");
        String  DV =     rs.getString("cliente_dv");
        String  ZV =     rs.getString("cliente_zv");
        float   saldo =  rs.getFloat ("cliente_saldo");

        Cliente cliente = new Cliente(cod,ape,nom,fnac,tel,DV,ZV,saldo);
        return cliente;
    }

    @Override
    public List<Cliente> obtener_todos() throws SQLException {
        List<Cliente> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETALL);
             ResultSet rs = stat.executeQuery()) {
            while(rs.next()){
                a.add(convertir(rs));
            }
        }
        return a;
    }

    @Override
    public Cliente obtener_uno(Short id) throws SQLException {
        Cliente a = null;
        try (PreparedStatement stat = conn.prepareStatement(GETONE)) {
            stat.setShort(1,id);
            try (ResultSet rs = stat.executeQuery()) {
                if(rs.next()){
                   a = convertir(rs);
                } else{
                    JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Cliente");
                }
            }
        }
        return a;
    }
}
