import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sensor> sensores = new ArrayList<>();

        sensores.add(
                new SensorTemperatura("T01", 35, "°C"));

        sensores.add(
                new SensorTemperatura("T02", 20, "°C"));

        sensores.add(
                new SensorPresion("P01", 120, "PSI"));

        sensores.add(
                new SensorPresion("P02", 80, "PSI"));

        sensores.add(
                new SensorNivel("N01", 25, "%"));

        sensores.add(
                new SensorNivel("N02", 70, "%"));

        for (Sensor sensor : sensores) {
            sensor.mostrarInformacion();
        }

        System.out.println(obtenerInterpretaciones(sensores));
    }

    public static String obtenerInterpretaciones(
            ArrayList<Sensor> sensores) {

        String resultado = "INTERPRETACIONES:\n";

        for (Sensor sensor : sensores) {
            resultado += sensor.codigo + " -> "
                    + sensor.interpretarLectura() + "\n";
        }

        return resultado;
    }
}