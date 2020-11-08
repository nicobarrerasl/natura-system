package DatabaseDAO;

import java.util.List;

public interface DAO<T,K> {
    
    void insertar(T a);
    
    void eliminar(T a);
    
    void modificar(T a);
    
    List<T> obtener_todos();
    
    T obtener_uno(K a);
    
}
