package DatabaseDAO.Postgre_SQL;
import Clases.Cliente;
import DatabaseDAO.clienteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PostgreSQL_Cliente implements clienteDAO{
    final String INSERT = "INSERT INTO Cliente(codCliente, cliente_apellido, cliente_nombre, cliente_edad, cliente_Fnac, cliente_tel, cliente_DV, cliente_ZV, cliente_DT, cliente_ZT, cliente_ocup) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)";                          
    final String UPDATE = "UPDATE Cliente SET codCliente = ?, cliente_apellido= ?, cliente_nombre= ?, cliente_edad= ?, cliente_Fnac= ?, cliente_tel= ?, cliente_DV= ?, cliente_ZV= ?, cliente_DT= ?, cliente_ZT= ?, cliente_ocup= ? WHERE codCliente = ?";
    final String DELETE = "DELETE FROM Cliente WHERE codCliente = ?";
    final String GETALL = "SELECT codCliente, cliente_apellido, cliente_nombre, cliente_edad, cliente_Fnac, cliente_tel, cliente_DV, cliente_ZV, cliente_DT, cliente_ZT, cliente_ocup FROM Cliente";
    final String GETONE = "SELECT codCliente, cliente_apellido, cliente_nombre, cliente_edad, cliente_Fnac, cliente_tel, cliente_DV, cliente_ZV, cliente_DT, cliente_ZT, cliente_ocup FROM Cliente WHERE codCliente = ?";
    private Connection conn;
    public PostgreSQL_Cliente(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Cliente a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setShort   (1,  a.getCodCliente());
            stat.setString  (2,  a.getCliente_apellido());
            stat.setString  (3,  a.getCliente_nombre());
            stat.setShort   (4,  a.getCliente_edad());
            stat.setString  (5,  a.getCliente_Fnac());
            stat.setString  (6,  a.getCliente_tel());
            stat.setString  (7,  a.getCliente_DV());
            stat.setString  (8,  a.getCliente_ZV());
            stat.setString  (9,  a.getCliente_DT());
            stat.setString  (10, a.getCliente_ZT());
            stat.setString  (11, a.getCliente_ocup());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo 1");
            
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"FAILED DATA BASE CONNECTION");
        }
            

    }

    @Override
    public void eliminar(Cliente a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setShort   (1,  a.getCodCliente());
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo 2");
            
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"FAILED DATA BASE CONNECTION");
        }
    }

    @Override
    public void modificar(Cliente a) {
         PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setShort   (1,  a.getCodCliente());
            stat.setString  (2,  a.getCliente_apellido());
            stat.setString  (3,  a.getCliente_nombre());
            stat.setShort   (4,  a.getCliente_edad());
            stat.setString  (5,  a.getCliente_Fnac());
            stat.setString  (6,  a.getCliente_tel());
            stat.setString  (7,  a.getCliente_DV());
            stat.setString  (8,  a.getCliente_ZV());
            stat.setString  (9,  a.getCliente_DT());
            stat.setString  (10, a.getCliente_ZT());
            stat.setString  (11, a.getCliente_ocup());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo 3");
            
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"FAILED DATA BASE CONNECTION");
        }
            

    }
    
    private Cliente convertir(ResultSet rs) throws SQLException {
        short   codCliente =        rs.getShort ("codCliente");
        String  cliente_apellido =  rs.getString("cliente_apellido");
        String  cliente_nombre =    rs.getString("cliente_nombre");
        short   cliente_edad =      rs.getShort ("cliente_edad");
        String  cliente_Fnac =      rs.getString("cliente_fnac");
        String  cliente_tel =       rs.getString("cliente_tel");
        String  cliente_DV =        rs.getString("cliente_dv");
        String  cliente_ZV =        rs.getString("cliente_zv");
        String  cliente_DT =        rs.getString("cliente_dt");
        String  cliente_ZT =        rs.getString("cliente_zt");
        String  cliente_ocup =      rs.getString("cliente_ocup");
        Cliente cliente = new Cliente(codCliente,cliente_apellido,cliente_nombre,cliente_edad,cliente_Fnac,cliente_tel,cliente_DV,cliente_ZV,cliente_DT,cliente_ZT,cliente_ocup);
        return cliente;
    }

    @Override
    public List<Cliente> obtener_todos(){
        PreparedStatement stat;
        ResultSet rs;
        List<Cliente> a = new ArrayList<>();
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery(); 
            while(rs.next()){
                a.add(convertir(rs));
            }
            rs.close();
            stat.close();

            
        }catch(SQLException ex){
            System.out.println("Fallo 4");
            
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"FAILED DATA BASE CONNECTION");
        }
        return a;
    }

    @Override
    public Cliente obtener_uno(Short id) {
        PreparedStatement stat;
        ResultSet rs;
        Cliente a = null;
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setShort(1,id);
            rs = stat.executeQuery(); 
            if(rs.next()){
               a = convertir(rs); 
            } else{
                System.out.println("Fallo 5");
                JOptionPane.showMessageDialog(null,"Resultado VACIO");
            }
            rs.close();
            stat.close();
        }catch(SQLException ex){
            System.out.println("Fallo 6");
            
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"FAILED DATA BASE CONNECTION");
        }
        return a;
    }
    public static void main(String[] args){
        Connection conn;
        final String url = "jdbc:postgresql://localhost:5432/Natura_DB";
        final String user = "postgres";
        final String pass = "1234";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            clienteDAO dao = new PostgreSQL_Cliente(conn);
            
            List<Cliente> clientes = dao.obtener_todos();
            clientes.forEach((a) -> {
                System.out.println(a.getCliente_apellido());
                System.out.println(a.getCliente_nombre());
            });
            conn.close();
            
        }
        catch (SQLException ex){
            System.out.println("error 7");
            System.out.println(ex.getMessage());
        }
    }
}
