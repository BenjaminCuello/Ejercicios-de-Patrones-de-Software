public class Sistema {
    private String nombre;
    private String numTarjeta;
    private String idHotel;

    public void guardarCliente(String nombreCliente, String numTarjeta) {
        this.nombre = nombreCliente;
        this.numTarjeta = numTarjeta;
    }

    public void guardarHotel(String number) {
        idHotel = number;
    }
}
