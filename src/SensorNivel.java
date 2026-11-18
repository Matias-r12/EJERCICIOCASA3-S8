public class SensorNivel extends Sensor {

    public SensorNivel(String codigo,
                       double lectura,
                       String unidad) {

        super(codigo, lectura, unidad);
    }

    @Override
    public String interpretarLectura() {

        if (lectura < 30) {
            return "Nivel Bajo";
        } else if (lectura <= 80) {
            return "Nivel Adecuado";
        } else {
            return "Nivel Alto";
        }
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("SENSOR DE NIVEL");
        System.out.println("Código: " + codigo);
        System.out.println("Lectura: " + lectura + " " + unidad);
        System.out.println("Interpretación: " + interpretarLectura());
    }
}