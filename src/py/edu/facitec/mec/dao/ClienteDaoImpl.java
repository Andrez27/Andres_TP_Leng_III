
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.util.ConexionManager;

public class ClienteDaoImpl implements ClienteDao{

    public void guardar(Cliente cliente){
        String sql = "INSERT INTO public.clientes"
                + "(nombres, apellidos, direccion, ciudad_codigo, celular, credito, estado) "
                + "VALUES ('"+cliente.getNombres()+"', '"+cliente.getApellidos()+"', '"+cliente.getDireccion()+"', '"+cliente.getCiudad_codigo()+"', "
                + ""+cliente.getCelular()+", "+cliente.getCredito()+", "+cliente.isEstado()+");";
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

    public boolean modificar(Cliente cliente) {
        String sql = "UPDATE public.clientes "
                + "SET nombres='"+cliente.getNombres()+"', apellidos='"+cliente.getApellidos()+"', direccion='"+cliente.getDireccion()+"', "
                + "ciudad_codigo="+cliente.getCiudad_codigo()+", celular='"+cliente.getCelular()+"', credito="+cliente.getCredito()+", "
                + "estado="+cliente.isEstado()+" "
                + "WHERE codigo="+cliente.getCodigo()+";";
        boolean resultado = false;

        ConexionManager.conectar();

        try {
            resultado = ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);
            
        }

        ConexionManager.desconectar();
        
        return resultado;

    }

    public Cliente recuperarPorCodigo(int codigo) {
        
        String sql = "SELECT nombres, apellidos, direccion, ciudad_codigo, celular, credito, estado "
                + "FROM public.clientes "
                + "WHERE codigo="+codigo+";";

        ConexionManager.conectar();
        
        Cliente cliente = null;
        
        ResultSet rs;
        
        try {
            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad_codigo(rs.getInt("ciudad_codigo"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCredito(rs.getDouble("credito"));
                cliente.setEstado(rs.getBoolean("estado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }
        ConexionManager.desconectar();
        return cliente;
    }

    public List<Cliente> recuperarPorFiltro(String filtro) {
        
//        String sql = "SELECT codigo, nombres, apellidos, direccion, credito "
//                + "FROM public.clientes WHERE nombres LIKE '%"+filtro+"'"
//                + " or apellidos LIKE '"+filtro+"%'"
//                + " or direccion LIKE '%"+filtro+"%';";
        
        String sql = "SELECT codigo, nombres, apellidos, direccion, credito "
                + "FROM public.clientes "
                + "WHERE (nombres LIKE '%"+filtro+"%') "
                + "or (apellidos LIKE '%"+filtro+"%') "
                + "or (direccion LIKE '%"+filtro+"%') ORDER BY nombres;";
        
        List<Cliente> lista = new ArrayList<>();
        
        System.out.println("SQL = " + sql);
        
        //abrir una conexion
        ConexionManager.conectar();
        
        Cliente cliente = null;
        
        ResultSet rs;
        
        try {
            //ejecutar sql
            
            rs = ConexionManager.st.executeQuery(sql);
            
            System.out.println("Ejecutando: "+sql);

            
            while (rs.next()) {
                
                cliente = new Cliente();
                
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCredito(rs.getDouble("credito"));
                
                //Agregara a la lista
                lista.add(cliente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ex);
        }
        //cerrar conexion
        ConexionManager.desconectar();
        
        return lista;

    }

    @Override
    public void eliminar(int codigo) {
        String sql = "DELETE FROM public.clientes WHERE codigo = "+codigo+";";
        
        System.out.println("SQL = "+sql);
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

}