public class Reserva {
    private Cliente cliente;
    private double precio;

    public Reserva(Cliente cliente, double precio) {
        this.cliente = cliente;
        this.precio = precio;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public double getPrecio() {
        return precio;
    }
}
