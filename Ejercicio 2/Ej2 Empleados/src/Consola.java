import java.util.Scanner;

public class Consola {
    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String mensaje) {
        System.out.println(mensaje);
    }

    public static void printSinSalto(String mensaje) {
        System.out.print(mensaje);
    }

    public static String preguntar(String pregunta) {
        print(pregunta);
        printSinSalto("> ");
        return scanner.nextLine();
    }

    public static int preguntarEntero(String pregunta) {
        int valor = -1;
        boolean valido = false;
        do {
            try {
                String entrada = preguntar(pregunta);
                valor = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                print("Entrada invalida, intente nuevamente");
            }
        } while (!valido);
        return valor;
    }

    public static double preguntarDouble(String pregunta) {
        double valor = -1;
        boolean valido = false;
        do {
            try {
                String entrada = preguntar(pregunta);
                valor = Double.parseDouble(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                print("Entrada invalida, intente nuevamente");
            }
        } while (!valido);
        return valor;
    }

    public static void cerrar() {
        scanner.close();
    }
}
