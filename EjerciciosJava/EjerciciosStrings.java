package EjerciciosJava;

public class EjerciciosStrings {
    public static void main(String[] args) {

        // 1.Concatena 2 cadenas de texto
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String resultado = cadena1 + " " + cadena2;
        System.out.println("Resultado de la concatenación: " + resultado);

        System.out.println();

        // 2.Muestra la longitud de una cadena de textos
        System.out.println("Longitud de la cadena de texto cadena1: " + cadena1.length());

        System.out.println();

        // 3.Muestra el primer y ultimo caracter de un String
        String palabra = "Juan";
        System.out.println("El primer caracter de la palabra Juan es:" + palabra.charAt(0)
                + " y el ultimo caracter de la palabra Juan es: " + palabra.charAt(palabra.length() - 1));

        System.out.println();

        // 4.Convierte a mayusculas y minusculas un String
        String texto = "Hola me llamo Antonio";
        System.out.println("El texto a mayusculas quedaria asi: " + texto.toUpperCase()
                + " y el texto a minusculas quedaria asi: " + texto.toLowerCase());

        System.out.println();

        // 5.Comprueba si una cadena de texto contiene una palabra
        System.out.println("El texto contiene la palabra Antonio? " + texto.contains("Antonio"));

        System.out.println();

        // 6.Formatea un String con un entero
        int numero = 10;
        System.out.println(String.format("El numero es: %d", numero));

        System.out.println();

        // 7.Elimina los espacios en blanco al final y al principio
        String textoConEspacios = "   Hola   ";
        System.out.println("Texto original: '" + textoConEspacios + "'");
        System.out.println("Texto sin espacios: '" + textoConEspacios.trim() + "'");

        System.out.println();

        // 8.Sustituye todos los espacios en blanco de un string por un guion.
        String textoConEspacios2 = "Hola Mundo";
        System.out.println("Texto original: '" + textoConEspacios2 + "'");
        System.out.println("Texto con guiones: '" + textoConEspacios2.replace(" ", "-") + "'");

        System.out.println();

        // 9.Comprueba si 2 Strings son iguales
        String texto1 = "Hola";
        String texto2 = "Hola";
        System.out.println("Los textos son iguales? " + texto1.equals(texto2));

        System.out.println();

        // 10.Comprueba si 2 Strings tienen la misma longitud
        String texto3 = "Hola";
        String texto4 = "Mundo";
        System.out.println("Los textos tienen la misma longitud? " + (texto3.length() == texto4.length()));

    }
}
