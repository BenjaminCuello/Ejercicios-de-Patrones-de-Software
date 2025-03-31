import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String tarjetaCredito;
    private ArrayList<Reserva> reservasCliente;

    public Cliente(String nombre, String tarjetaCredito) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
        this.reservasCliente = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String tarjetaConNumerosOcultos() {
        if (tarjetaCredito != null && tarjetaCredito.length() >= 4) {
            String[] partes = tarjetaCredito.split("");
            int longitud = partes.length;
            String ultimos4 = "";
            for (int i = longitud - 4; i < longitud; i++) {
                ultimos4 += partes[i];
            }
            return "**** **** **** " + ultimos4;
        }
        return tarjetaCredito;
    }



    public void agregarReserva(Reserva reserva) {
        reservasCliente.add(reserva);
    }
}