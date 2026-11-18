public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String codigo,
                             double lectura,
                             String unidad) {

        super(codigo, lectura, unidad);
    }

    @Override
    public String interpretarLectura() {

        if (lectura < 10) {
            return "Temperatura Baja";
        } else if (lectura <= 30) {
            return "Temperatura Normal";
        } else {
            return "Temperatura Alta";
        }
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("SENSOR DE TEMPERATURA");
        System.out.println("Código: " + codigo);
        System.out.println("Lectura: " + lectura + " " + unidad);
        System.out.println("Interpretación: " + interpretarLectura());
    }
}