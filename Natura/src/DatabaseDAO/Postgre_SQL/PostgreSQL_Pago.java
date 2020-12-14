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
    final String UPDATE = "UPDATE Pago SET  codPago= ?, pago_fecha= ?, pago_saldo= ?, codCliente= ? WHERE codPago = ?";
    final String DELETE = "UPDATE Pago SET status = 0 WHERE codPago = ?";
    final String GETALL = "SELECT * FROM Pago WHERE status = 1"; 
    final String GETONE = "SELECT * FROM Pago WHERE codPago = ? AND status = 1";
    final String ERR    = "ERROR EN QUERY:DB";
    private final Connection conn;
    public PostgreSQL_Pago(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Pago a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setString(1,  a.getPago_fecha());
            stat.setFloat(2,  a.getPago_saldo());
            stat.setShort(3,  a.getCliente().getCodCliente());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en ALTA Pago");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    @Override
    public void eliminar(Pago a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setShort(1,  a.getCodPago().shortValue());
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en ELIMINACION Pago");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }

    @Override
    public void modificar(Pago a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setShort   (1,  a.getCodPago().shortValue());
            stat.setString  (2,  a.getPago_fecha());
            stat.setFloat   (3,  a.getPago_saldo());
            stat.setShort   (4,  a.getCliente().getCodCliente());

            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en UPDATE Pago");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
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
    public List<Pago> obtener_todos() {
        PreparedStatement stat;
        ResultSet rs;
        List<Pago> a = new ArrayList<>();
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery(); 
            while(rs.next()){
                a.add(convertir(rs));
            }
            rs.close();
            stat.close();

        }catch(SQLException ex){
            System.out.println("Fallo en Obtener_todos Pago");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
    }

    @Override
    public Pago obtener_uno(Long id) {
        PreparedStatement stat;
        ResultSet rs;
        Pago a = null;
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setShort(1,id.shortValue());
            rs = stat.executeQuery(); 
            if(rs.next()){
               a = convertir(rs); 
            } else{
                JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Pago");
            }
            rs.close();
            stat.close();
        }catch(SQLException ex){
            System.out.println("Fallo en obtener 1 Pago");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
    }
}
