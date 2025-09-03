package Java;

public class EstructurasNumeros {
    public static void main(String[] args) {
        // Sacado de CoddyJava
        // TIPOS DE DATOS PRIMITIVOS
        // Crear variables enteras
        int temperature = 28;
        int humidity = 65;
        int windSpeed = 15;

        // Crear variables decimales
        double morningTemp = 22.5;
        double afternoonTemp = 28.8;
        double eveningTemp = 23.4;

        // Crear variables con var (Detecta por si solo el tipo de dato que introduces)
        var morningTempVar = 22.5;
        var afternoonTempVar = 288;
        var eveningTempVar = "234";

        /*
         * Puedes crear variables tipandolos explicitamente o con la variable var pero
         * no las 2 a la vez
         */

        // No modificar el código a continuación
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Humidity Level: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Morning Temperature: " + morningTemp);
        System.out.println("Afternoon Temperature: " + afternoonTemp);
        System.out.println("Evening Temperature: " + eveningTemp);
    }
    /*
     * Las variables son contenedores que almacenan valores de datos.Se utilizan
     * para guardar manipular y mostrar informacion dentro de un programa.
     * Cada variable tiene un nombre unico y un valor que puede ser de diferentes
     * tipos
     * Los numeros se representan usando 2 tipos de datos principales: enteros y
     * decimales.
     * ! Los enteros se representan con el tipo de dato int y los decimales con el
     * tipo de dato double.
     * 
     */
}
