public class Hotel {
    private String id;

    public Hotel(String id) {
        this.id = id;
    }

    public void hacerReserva(Cliente cliente) {
        System.out.println("Reserva realizada para " + cliente.nombre);
        System.out.println("Procesando pago con tarjeta  " + cliente.tarjetaCredito);
    }
}
