/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDAO.Postgre_SQL;

import Clases.Compra;
import DatabaseDAO.compraDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Franco
 */
public class PostgreSQL_Compra implements compraDAO {
    
    final String INSERT = "INSERT INTO Compra(compra_fecha, compra_saldo, codcliente) VALUES (?, ?, ?)";                          
    final String UPDATE = "UPDATE Cliente SET  cliente_apellido= ?, cliente_nombre= ?, cliente_edad= ?, cliente_Fnac= ?, cliente_tel= ?, cliente_DV= ?, cliente_ZV= ?, cliente_DT= ?, cliente_ZT= ?, cliente_ocup= ? WHERE codCliente = ?";
    final String DELETE = "UPDATE Cliente SET status = 0 WHERE codCliente = ?";
    final String GETALL = "SELECT * FROM Cliente WHERE status = 1"; 
    final String GETONE = "SELECT * FROM Cliente WHERE codCliente = ? AND status = 1";
    final String ERR = "ERROR EN QUERY:DB";
    private final Connection conn;
    public PostgreSQL_Compra(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insertar(Compra a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Compra a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Compra a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> obtener_todos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra obtener_uno(Short a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
