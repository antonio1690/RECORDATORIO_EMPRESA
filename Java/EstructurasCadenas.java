package Java;

public class EstructurasCadenas {
    public static void main(String[] args) {
        // CADENA DE TEXTO
        String name = "Antonio";
        String lastName = "García";

        // OPERACIONES BASICAS
        System.out.println("Nombre completo: " + name + " " + lastName);

        System.out.println();

        // LONGITUD
        System.out.println("Longitud del nombre: " + name.length());
        System.out.println("Longitud del apellido: " + lastName.length());

        System.out.println();

        // OBTENER CARACTER
        System.out.println("Primer carácter del nombre: " + name.charAt(0));
        System.out.println("Primer carácter del apellido: " + lastName.charAt(0));
        System.out.println("Último carácter del nombre: " + name.charAt(name.length() - 1)); // Otra forma de obtener el
                                                                                             // último carácter sin
                                                                                             // tener que saber los
                                                                                             // caracteres de la palabra
        System.out.println();

        // SUBCADENA
        System.out.println("Subcadena del nombre (índices 1 a 3): " + name.substring(1, 4));
        System.out.println("Subcadena del apellido (índices 0 a 2): " + lastName.substring(0, 3));

        System.out.println();

        // CONVERTIR EN MAYUSCULAS Y EN MINUSCULAS
        System.out.println("Nombre en mayúsculas: " + name.toUpperCase());
        System.out.println("Apellido en mayúsculas: " + lastName.toUpperCase());
        System.out.println("Nombre en minúsculas: " + name.toLowerCase());
        System.out.println("Apellido en minúsculas: " + lastName.toLowerCase());

        System.out.println();

        // COMPROBAR SI CONTIENE UNA CADENA DE TEXTO
        System.out.println("¿Contiene 'Ant' en el nombre? " + name.contains("Ant"));
        System.out.println("¿Contiene 'Gar' en el apellido? " + lastName.contains("Gar"));

        System.out.println();

        // COMPARACION DE CADENAS
        System.out.println("¿Es igual el nombre y el apellido? " + name.equals(lastName));
        System.out.println(
                "¿Es igual el nombre y el apellido (ignorando mayúsculas)? " + name.equalsIgnoreCase(lastName));

        System.out.println();

        // DIFERENCIAS ENTRE EL == Y EL EQUALS
        String str1 = new String("Hola");
        String str2 = new String("Hola");

        System.out.println("Comparación con == : " + (str1 == str2)); // EL == compara los objetos.
        System.out.println("Comparación con equals: " + str1.equals(str2)); // El equals compara el contenido de los
                                                                            // objetos.

        System.out.println();

        // TRIM Y REPLACE
        String texto = "   Hola Mundo   ";
        System.out.println("Texto original: '" + texto + "'");
        System.out.println("Texto con trim: '" + texto.trim() + "'"); // Elimina los espacios en blanco al inicio y al
                                                                      // final
        System.out.println("Texto con replace: '" + texto.replace("Mundo", "Java") + "'"); // Reemplaza "Mundo" con
                                                                                           // "Java"

        System.out.println();

        // FORMATEO
        String texto2 = "Hola Mundo";
        System.out.println("Texto original: '" + texto2 + "'");
        System.out.println("Texto formateado: '" + String.format("Bienvenido, %s!", texto2) + "'");
        // La %s es para cadenas,el %d es para valores enteros y la %f para valores
        // decimales

    }

}