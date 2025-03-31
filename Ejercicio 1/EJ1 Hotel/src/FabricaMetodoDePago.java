public class FabricaMetodoDePago {
    public static MetodoDePago obtenerMetodoPago(String opcion) {
        switch (opcion) {
            case "1":
                return new PagoDebito();
            case "2":
                return new PagoCredito();
            case "3":
                return new PagoEfectivo();
            default:
                return null;
        }
    }
}
