
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

public interface ClienteDao {
    void guardar(Cliente cliente);
    boolean modificar(Cliente cliente);
    Cliente recuperarPorCodigo(int codigo);
    List<Cliente> recuperarPorFiltro(String filtro);
    void eliminar(int codigo);
}
