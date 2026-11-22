/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseDAO.Postgre_SQL;

import Clases.Cliente;
import Clases.Compra;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DatabaseDAO.DAO_Compra;

public class PostgreSQL_Compra implements DAO_Compra {

    // RETURNING devuelve el id generado de esta misma fila (LASTVAL podia devolver el de otra tabla).
    final String INSERT = "INSERT INTO Compra(compra_fecha, compra_saldo, codCliente) VALUES (?, ?, ?) RETURNING codCompra";
    final String UPDATE = "UPDATE Compra SET  compra_fecha= ?, compra_saldo= ?, codCliente= ? WHERE codCompra = ?";
    final String DELETE = "DELETE FROM Compra WHERE codCompra = ?";
    final String GETALL = "SELECT * FROM Compra WHERE status = 1";
    final String GETONE = "SELECT * FROM Compra WHERE codCompra = ?";
    final String GETBYCUSTOMER = "SELECT * FROM Compra WHERE codcliente = ? AND status = 1";
    private final Connection conn;

    public PostgreSQL_Compra(Connection conn){
        this.conn = conn;
    }

    /** Inserta la compra y le asigna el codCompra generado por la base. */
    @Override
    public void insertar(Compra a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(INSERT)) {
            stat.setString  (1, a.getCompra_fecha());
            stat.setFloat   (2, a.getCompra_saldo());
            stat.setShort   (3, a.getCliente().getCodCliente());
            try (ResultSet rs = stat.executeQuery()) {
                rs.next();
                a.setCodCompra(rs.getShort(1));
            }
        }
    }

    @Override
    public void eliminar(Compra a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(DELETE)) {
            stat.setShort(1,  a.getCodCompra());
            stat.executeUpdate();
        }
    }

    @Override
    public void modificar(Compra a) throws SQLException {
        try (PreparedStatement stat = conn.prepareStatement(UPDATE)) {
            stat.setString(1,  a.getCompra_fecha());
            stat.setFloat(2,  a.getCompra_saldo());
            stat.setShort(3,  a.getCliente().getCodCliente());
            stat.setShort(4,  a.getCodCompra());
            stat.executeUpdate();
        }
    }

    private Compra convertir (ResultSet rs) throws SQLException {
        short      codCompra = rs.getShort ("codCompra");
        String     fecha = rs.getString("compra_fecha");
        float     saldo = rs.getFloat("compra_saldo");
        short      codCliente = rs.getShort ("codCliente");

        Cliente cliente = new Cliente(codCliente);
        ArrayList<Producto> prod = null;
        Compra compra = new Compra(codCompra, fecha, saldo, cliente, prod);
        return compra;
    }

    @Override
    public List<Compra> obtener_todos() throws SQLException {
        List<Compra> a = new ArrayList<>();
        try (PreparedStatement stat = conn.prepareStatement(GETALL);
             ResultSet rs = stat.executeQuery()) {
            while(rs.next()){
                a.add(convertir(rs));
            }
        }
        return a;
    }

    @Override
    public Compra obtener_uno(Short id) throws SQLException {
        Compra a = null;
        try (PreparedStatement stat = conn.prepareStatement(GETONE)) {
            stat.setShort(1,id);
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

    public List<Compra> obtener_por_cliente(Short codcliente) throws SQLException {
        List<Compra> a = new ArrayList<>();
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
