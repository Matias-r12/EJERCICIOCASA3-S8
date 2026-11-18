public class SensorPresion extends Sensor {

    public SensorPresion(String codigo,
                         double lectura,
                         String unidad) {

        super(codigo, lectura, unidad);
    }

    @Override
    public String interpretarLectura() {

        if (lectura < 50) {
            return "Presión Baja";
        } else if (lectura <= 100) {
            return "Presión Normal";
        } else {
            return "Presión Alta";
        }
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("SENSOR DE PRESIÓN");
        System.out.println("Código: " + codigo);
        System.out.println("Lectura: " + lectura + " " + unidad);
        System.out.println("Interpretación: " + interpretarLectura());
    }
}
