
package py.edu.facitec.mec.dao;

import java.util.Date;
import java.util.List;
import py.edu.facitec.mec.model.Mantenimiento;

public interface MantenimientoDao {
    void guardar(Mantenimiento mantenimiento);
    Mantenimiento recuperarPorCodigo(int codigo); 
    void anular(int codigo);
    int obtenerMaximo();
    List<Mantenimiento> reporteMantenimiento(String fecha1, String fecha2, int cod1, int cod2, String orden);
}