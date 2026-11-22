/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseControlador;

import Clases.*;
import DatabaseDAO.Postgre_SQL.*;
import DatabaseSingleton.PostgreSQL_Singleton;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class Controlador {

    public static List<Cliente> cliente_traer_todos() throws SQLException{
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente(PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Cliente.obtener_todos());
    }
    public static Cliente cliente_traer_uno(short id) throws SQLException{
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente(PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Cliente.obtener_uno(id));
    }
    public static void cliente_modificar(Cliente nuevo) throws SQLException{
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente (PostgreSQL_Singleton.getInstance().getConnection());
        DAO_Cliente.modificar(nuevo);
    }
    public static void cliente_insertar(Cliente nuevo) throws SQLException{
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente (PostgreSQL_Singleton.getInstance().getConnection());
        DAO_Cliente.insertar(nuevo);
    }

    public static List<Producto> producto_traer_todos() throws SQLException{
        PostgreSQL_Producto DAO_Producto = new PostgreSQL_Producto (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Producto.obtener_todos());
    }
    public static Producto producto_traer_uno(int id) throws SQLException{
        PostgreSQL_Producto DAO_Producto = new PostgreSQL_Producto (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Producto.obtener_uno(id));
    }
    public static void producto_modificar(Producto nuevo) throws SQLException{
        PostgreSQL_Producto DAO_Producto = new PostgreSQL_Producto (PostgreSQL_Singleton.getInstance().getConnection());
        DAO_Producto.modificar(nuevo);
    }


    public static List<Compra> compra_traer_todos() throws SQLException{
        PostgreSQL_Compra DAO_Compra = new PostgreSQL_Compra (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Compra.obtener_todos());
    }
    public static Compra compra_traer_uno(short id) throws SQLException{
        PostgreSQL_Compra DAO_Compra = new PostgreSQL_Compra (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Compra.obtener_uno(id));
    }
    public static void compra_modificar(Compra nuevo) throws SQLException{
        PostgreSQL_Compra DAO_Compra = new PostgreSQL_Compra (PostgreSQL_Singleton.getInstance().getConnection());
        DAO_Compra.modificar(nuevo);
    }
    public static List<Compra> compra_traer_por_cliente(Short codCliente) throws SQLException{
        PostgreSQL_Compra DAO_Compra = new PostgreSQL_Compra (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Compra.obtener_por_cliente(codCliente));
    }

    /**
     * Registra una compra completa en una sola transaccion: descuenta el stock,
     * inserta la compra y sus productos, y suma (importe - descuento) al saldo del cliente.
     * Si cualquier paso falla no queda nada grabado.
     */
    public static void registrar_compra(Compra compra, List<CompraProducto> items, float descuento) throws SQLException{
        Connection conn = PostgreSQL_Singleton.getInstance().getConnection();
        PostgreSQL_Producto DAO_Producto = new PostgreSQL_Producto(conn);
        PostgreSQL_Compra DAO_Compra = new PostgreSQL_Compra(conn);
        PostgreSQL_CompraProducto DAO_CP = new PostgreSQL_CompraProducto(conn);
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente(conn);
        en_transaccion(conn, () -> {
            for (CompraProducto item : items) {
                DAO_Producto.descontar_stock(item.getCodProducto(), item.getCantidad());
            }
            DAO_Compra.insertar(compra);
            for (CompraProducto item : items) {
                item.setCodCompra(compra.getCodCompra());
                DAO_CP.insertar(item);
            }
            DAO_Cliente.sumar_saldo(compra.getCliente().getCodCliente(), compra.getCompra_saldo() - descuento);
        });
    }


    public static void comprap_insertar(CompraProducto nuevo) throws SQLException{
        PostgreSQL_CompraProducto DAO_CP = new PostgreSQL_CompraProducto (PostgreSQL_Singleton.getInstance().getConnection());
        DAO_CP.insertar(nuevo);
    }
    public static List<String[]> comprap_obtener_por_compra(Short id) throws SQLException{
        PostgreSQL_CompraProducto DAO_CP = new PostgreSQL_CompraProducto (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_CP.obtener_por_compra(id));
    }


    /** Registra el pago y lo descuenta del saldo del cliente, en una sola transaccion. */
    public static void registrar_pago(Pago nuevo) throws SQLException{
        Connection conn = PostgreSQL_Singleton.getInstance().getConnection();
        PostgreSQL_Pago DAO_Pago = new PostgreSQL_Pago(conn);
        PostgreSQL_Cliente DAO_Cliente = new PostgreSQL_Cliente(conn);
        en_transaccion(conn, () -> {
            DAO_Pago.insertar(nuevo);
            DAO_Cliente.sumar_saldo(nuevo.getCliente().getCodCliente(), -nuevo.getPago_saldo());
        });
    }
     public static List<Pago> pago_traer_por_cliente(Short id) throws SQLException{
        PostgreSQL_Pago DAO_Pago = new PostgreSQL_Pago (PostgreSQL_Singleton.getInstance().getConnection());
        return(DAO_Pago.obtener_por_cliente(id));
    }

    public static void cerrar_conexion() throws SQLException{
        PostgreSQL_Singleton.getInstance().disconnect();
    }

    private interface PasosSQL {
        void ejecutar() throws SQLException;
    }

    /** Ejecuta los pasos como una unidad: commit si todos salen bien, rollback si alguno falla. */
    private static void en_transaccion(Connection conn, PasosSQL pasos) throws SQLException{
        conn.setAutoCommit(false);
        try {
            pasos.ejecutar();
            conn.commit();
        } catch (SQLException | RuntimeException ex) {
            conn.rollback();
            throw ex;
        } finally {
            conn.setAutoCommit(true);
        }
    }
}
