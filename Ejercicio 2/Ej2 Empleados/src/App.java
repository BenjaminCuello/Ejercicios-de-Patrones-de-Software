public class App {
    private ISistemaEmpleados sistema = SistemaEmpleadosImp.getInstancia();

    public void ejecutar() {
        String opcion;
        do {
            mostrarMenu();
            opcion = Consola.preguntar("Seleccione una opcion");
            procesarOpcion(opcion);
        } while (!opcion.equals("0"));

        Consola.print("Programa finalizado");
        Consola.cerrar();
    }

    private void mostrarMenu() {
        Consola.print("Seleccione una opcion:");
        Consola.print("1) Agregar empleado");
        Consola.print("2) Mostrar empleado");
        Consola.print("3) Actualizar empleado");
        Consola.print("4) Eliminar empleado");
        Consola.print("0) Salir");
    }

    private void procesarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                sistema.agregarEmpleado();
                break;
            case "2":
                sistema.mostrarEmpleado();
                break;
            case "3":
                sistema.actualizarEmpleado();
                break;
            case "4":
                sistema.eliminarEmpleado();
                break;
            case "0":
                break;
            default:
                Consola.print("Opcion invalida, intente de nuevo");
        }
    }

    public static void main(String[] args) {
        new App().ejecutar();
    }
}
