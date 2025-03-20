import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inicioDePrograma();
    }

    private static void inicioDePrograma() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        sistema.guardarHotel("1111");
        String nombreCliente = preguntar("nombre", scanner);
        String numTarjeta = preguntar("numero de tarjeta", scanner);
        sistema.guardarCliente(nombreCliente,numTarjeta);

        hotel.hacerReserva(cliente);
    }

    private static String preguntar(String pregunta, Scanner scanner) {
        print("Ingrese su " + pregunta);
        print("> ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
