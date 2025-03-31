public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, String puesto, double salario, int horasTrabajadas) {
        super(nombre, puesto, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * horasTrabajadas / 40.0;
    }

    @Override
    public String obtenerInformacionAdicional() {
        return "Horas trabajadas: " + getHorasTrabajadas();
    }

}
