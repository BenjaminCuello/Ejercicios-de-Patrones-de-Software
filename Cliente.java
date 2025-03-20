public class Cliente {
    //cambio a private atributos
    private String nombre;
    private String tarjetaCredito;
    public Cliente(String nombre, String tarjetaCredito) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
}
