public class SistemaEmpleadosImp implements ISistemaEmpleados {
    private IEmpleadoServicio servicioEmpleado;
    private static SistemaEmpleadosImp instancia;

    private SistemaEmpleadosImp() {
        IEmpleadoDAO empleadoDAO = new EmpleadoDAO();
        servicioEmpleado = new EmpleadoService(empleadoDAO);
    }

    public static SistemaEmpleadosImp getInstancia() {
        if (instancia == null) {
            instancia = new SistemaEmpleadosImp();
        }
        return instancia;
    }

    @Override
    public void agregarEmpleado() {
        String tipo = Consola.preguntar("Escriba el tipo de empleado ( 1) Tiempo completo, 2) Tiempo parcial)");
        String nombre = Consola.preguntar("Ingrese el nombre del empleado");
        String puesto = Consola.preguntar("Ingrese el puesto del empleado");
        double salario = Consola.preguntarDouble("Ingrese el salario base del empleado");
        Empleado empleado;
        if (tipo.equals("2")) {
            int horas = Consola.preguntarEntero("Ingrese las horas trabajadas");
            empleado = new EmpleadoTiempoParcial(nombre, puesto, salario, horas);
        } else {
            empleado = new Empleado(nombre, puesto, salario);
        }
        servicioEmpleado.agregarEmpleado(empleado);
        Consola.print("Empleado agregado correctamente");
    }

    @Override
    public void mostrarEmpleado() {
        String nombre = Consola.preguntar("Ingrese el nombre del empleado a mostrar");
        Empleado empleado = servicioEmpleado.obtenerEmpleado(nombre);
        if (empleado != null) {
            Consola.print("Nombre: " + empleado.getNombre());
            Consola.print("Puesto: " + empleado.getPuesto());
            Consola.print("Salario: " + empleado.getSalario());
            String infoAdicional = empleado.obtenerInformacionAdicional();
            if (!infoAdicional.isEmpty()) {
                Consola.print(infoAdicional);
            }
        } else {
            Consola.print("Empleado no encontrado");
        }
    }


    @Override
    public void actualizarEmpleado() {
        String nombre = Consola.preguntar("Ingrese el nombre del empleado a actualizar");
        Empleado empleado = servicioEmpleado.obtenerEmpleado(nombre);
        if (empleado != null) {
            String nuevoPuesto = Consola.preguntar("Ingrese el nuevo puesto");
            double nuevoSalario = Consola.preguntarDouble("Ingrese el nuevo salario");
            empleado.setPuesto(nuevoPuesto);
            empleado.setSalario(nuevoSalario);
            servicioEmpleado.actualizarEmpleado(empleado);
            Consola.print("Empleado actualizado correctamente");
        } else {
            Consola.print("Empleado no encontrado");
        }
    }

    @Override
    public void eliminarEmpleado() {
        String nombre = Consola.preguntar("Ingrese el nombre del empleado a eliminar");
        servicioEmpleado.eliminarEmpleado(nombre);
        Consola.print("Empleado eliminado ");
    }
}
