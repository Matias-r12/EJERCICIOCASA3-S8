public class Sensor {

    protected String codigo;
    protected double lectura;
    protected String unidad;

    public Sensor(String codigo, double lectura, String unidad) {
        this.codigo = codigo;
        this.lectura = lectura;
        this.unidad = unidad;
    }

    public String interpretarLectura() {
        return "Lectura normal";
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Lectura: " + lectura);
        System.out.println("Unidad: " + unidad);
    }
}