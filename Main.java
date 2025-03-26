import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejecutar();
    }

    private static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        EmpleadoDAO dao = new EmpleadoDAO();
        String opcion = "";
        do {
            switch (opcion) {
                case "1":
                    String nombreParaAgregar = preguntar("Ingrese el nombre a agregar:", scanner);
            }
            menu();
        }while (opcion != "5");
    }

    private static String preguntar(String pregunta, Scanner scanner) {
        String respuesta = "";
        print(pregunta);
        respuesta = scanner.nextLine();
        print("> ");
        return respuesta;
    }

    private static void menu() {
        print("¿Que desea hacer?");
        print("1) Agregar Empleado");
        print("2) Obtener Empleado");
        print("3) Eliminar Empleado");
        print("4) Actualizar Empleado");
        print("5) Salir");
    }
    private static void print(String string) {
        System.out.println(string);
    }
}