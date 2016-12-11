package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.model.Cliente;

public class ClienteControllerImpl implements ClienteController{

    private ClienteDao clienteDao;

    public ClienteControllerImpl() {
        this.clienteDao = new ClienteDaoImpl();
    
    }

    public void registrar(Cliente cliente) {
        clienteDao.guardar(cliente);
    }

    public boolean modificar(Cliente cliente) {
        return clienteDao.modificar(cliente);
    }

    public Cliente recuperarPorCodigo(int codigo) {
        return clienteDao.recuperarPorCodigo(codigo);
    }

    public List<Cliente> recuperarPorFiltro(String busqueda) {
        return clienteDao.recuperarPorFiltro(busqueda);
    }

    public void eliminarCliente(int codigo) {
        clienteDao.eliminar(codigo);
    }
}
