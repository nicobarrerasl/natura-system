package DatabaseDAO.Postgre_SQL;
import Clases.Producto;
import DatabaseDAO.productoDAO;
import java.sql.Connection;
import java.util.List;

public class PostgreSQL_Producto implements productoDAO{
    
    private Connection conn;
    public PostgreSQL_Producto(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Producto a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> obtener_todos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto obtener_uno(Short a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


    
}
