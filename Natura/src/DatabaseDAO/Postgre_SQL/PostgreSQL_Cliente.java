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
    final String UPDATE = "UPDATE Cliente SET  cliente_apellido= ?, cliente_nombre= ?, cliente_Fnac= ?, cliente_tel= ?, cliente_DV= ?, cliente_ZV= ?, cliente_saldo= ? WHERE codCliente = ?";
    final String DELETE = "UPDATE Cliente SET status = 0 WHERE codCliente = ?";
    final String GETALL = "SELECT * FROM Cliente WHERE status = 1"; 
    final String GETONE = "SELECT * FROM Cliente WHERE codCliente = ? AND status = 1";
    final String ERR = "ERROR EN QUERY:DB";
    private final Connection conn;
    public PostgreSQL_Cliente(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Cliente a) {
        PreparedStatement stat;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setString  (1,  a.getApellido()         );
            stat.setString  (2,  a.getNombre()           );
            stat.setString  (3,  a.getFechaNac()         );
            stat.setString  (4,  a.getTelefono()         );
            stat.setString  (5,  a.getDireccion()        );
            stat.setString  (6,  a.getZonaVivienda()     );
            
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
            System.out.println("Fallo en ELIMINACION Cliente");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
    }
    @Override
    public void modificar(Cliente a) {
         PreparedStatement stat;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setString  (1,  a.getApellido());
            stat.setString  (2,  a.getNombre());
            stat.setString  (3,  a.getFechaNac());
            stat.setString  (4,  a.getTelefono());
            stat.setString  (5,  a.getDireccion());
            stat.setString  (6,  a.getZonaVivienda());
            stat.setFloat   (7,  a.getSaldo());
            stat.setShort   (8,  a.getCodCliente());
            
            if(stat.executeUpdate()== 0){
                // ERROR
            }
            stat.close();
        }
        catch(SQLException ex){
            System.out.println("Fallo en UPDATE Cliente");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
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
            System.out.println("Fallo en Obtener_todos Cliente");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
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
                JOptionPane.showMessageDialog(null,"Resultado VACIO obtener_uno Cliente");
            }
            rs.close();
            stat.close();
        }catch(SQLException ex){
            System.out.println("Fallo en obtener 1 Cliente");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ERR);
        }
        return a;
    }
}
