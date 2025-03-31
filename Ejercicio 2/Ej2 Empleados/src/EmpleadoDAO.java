import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements IEmpleadoDAO {
    private List<Empleado> empleados;

    public EmpleadoDAO() {
        empleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        Empleado empleado = obtenerEmpleado(nombre);
        if (empleado != null) {
            empleados.remove(empleado);
        }
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equalsIgnoreCase(empleado.getNombre())) {
                empleados.set(i, empleado);
                break;
            }
        }
    }
}
