import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hacerReservaDeHotel();
    }

    private static void hacerReservaDeHotel() {
        Sistema sistema = new Sistema();
        Cliente cliente = new Cliente("Juan Perez", "1234567890123456");
        Hotel hotel = new Hotel();
        System.out.println(sistema.hacerReserva(hotel, cliente));
        MetodoDePago metodoDePagoSeleccionado = seleccionarMetodoPago();
        if (metodoDePagoSeleccionado != null) {
            System.out.println(metodoDePagoSeleccionado.realizarPago(cliente));
        } else {
            System.out.println("Metodo de pago no valido");
        }
        System.out.println(menuReserva(sistema));
    }

    private static String menuReserva(Sistema sistema) {
        String opcion = "";
        String respuestaFinal = "";
        do {
            mostrarMenuReserva();
            System.out.print("> ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    respuestaFinal = sistema.agregarReserva();
                    break;
                case "2":
                    respuestaFinal = sistema.eliminarReserva();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (!opcion.equals("1") && !opcion.equals("2"));
        return respuestaFinal;
    }

    private static void mostrarMenuReserva() {
        System.out.println("¿Que desea realizar?");
        System.out.println("1) Agregar Reserva");
        System.out.println("2) Eliminar Reserva");
    }

    private static MetodoDePago seleccionarMetodoPago() {
        String opcion = "";
        boolean opcionValida = false;
        MetodoDePago metodoPago = null;
        while (!opcionValida) {
            mostrarMenuPago();
            System.out.print("> ");
            opcion = scanner.nextLine();
            if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3")) {
                metodoPago = FabricaMetodoDePago.obtenerMetodoPago(opcion);
                opcionValida = true;
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }
        return metodoPago;
    }


    private static void mostrarMenuPago() {
        System.out.println("Seleccione el metodo de pago que quiere utilizar:");
        System.out.println("1) Pagar con Tarjeta de debito");
        System.out.println("2) Pagar con Tarjeta de credito");
        System.out.println("3) Pagar en Efectivo");
        System.out.print("> ");
    }
}