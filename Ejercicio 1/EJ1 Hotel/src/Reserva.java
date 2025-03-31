public class Reserva {
    private Cliente cliente;
    private Hotel hotel;

    public Reserva(Cliente cliente, Hotel hotel) {
        this.cliente = cliente;
        this.hotel = hotel;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }
}