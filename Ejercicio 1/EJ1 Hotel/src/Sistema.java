import java.util.ArrayList;

public class Sistema {
    private ArrayList<Reserva> reservas;

    public Sistema() {
        reservas = new ArrayList<>();
    }

    public String hacerReserva(Hotel hotel, Cliente cliente) {
        Reserva reserva = new Reserva(cliente, hotel);
        reservas.add(reserva);
        cliente.agregarReserva(reserva);
        return hotel.mensajeConfirmacion(cliente);
    }

    public String agregarReserva() {
        Reserva base = reservas.get(0);
        Reserva nuevaReserva = new Reserva(base.getCliente(), base.getHotel());
        reservas.add(nuevaReserva);
        base.getCliente().agregarReserva(nuevaReserva);
        return "Reserva agregada, total de reservas: " + reservas.size();
    }

    public String eliminarReserva() {
        if (reservas.size() > 0) {
            reservas.remove(reservas.size() - 1);
            return "Reserva eliminada, total de reservas: " + reservas.size();
        } else {
            return "No hay reservas para eliminar";
        }
    }
}