public class PagoCredito implements MetodoDePago {
    public String realizarPago(Cliente cliente) {
        return "Procesando pago con Tarjeta de credito: " + cliente.tarjetaConNumerosOcultos();
    }
}