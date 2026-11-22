package DatabaseDAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T,K> {

    void insertar(T a) throws SQLException;

    void eliminar(T a) throws SQLException;

    void modificar(T a) throws SQLException;

    List<T> obtener_todos() throws SQLException;

    T obtener_uno(K a) throws SQLException;

}
