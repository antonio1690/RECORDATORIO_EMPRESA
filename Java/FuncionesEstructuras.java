package Java;

public class FuncionesEstructuras {
    public static void main(String[] args) {
        // FUNCIONES COMUNES PARA NUMEROS
        Math.abs(-10); // Valor absoluto
        Math.pow(2, 4); // Calcula la potencia de un numero
        Math.sqrt(16); // Raíz cuadrada
        Math.random(); // Número aleatorio
        Math.round(4.7); // Redondear
        Math.floor(4.7); // Redondear hacia abajo
        Math.ceil(4.7); // Redondear hacia arriba
        Math.min(2, 4); // Valor mínimo
        Math.max(2, 4); // Valor máximo

        System.out.println(Math.abs(-10));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.random());
        System.out.println(Math.round(4.7));
        System.out.println(Math.floor(4.7));
        System.out.println(Math.ceil(4.7));
        System.out.println(Math.min(2, 4));
        System.out.println(Math.max(2, 4));

        // FUNCIONES COMUNES PARA CADENAS
        String texto = "Hola Mundo";
        System.out.println(texto.toUpperCase()); // Convertir a mayúsculas
        System.out.println(texto.toLowerCase()); // Convertir a minúsculas
        System.out.println(texto.length()); // Longitud de la cadena
        System.out.println(texto.charAt(0)); // Caracter en la posición 0
        System.out.println(texto.substring(0, 4)); // Subcadena
        System.out.println(texto.indexOf("Mundo")); // Índice de la palabra "Mundo"
        System.out.println(texto.lastIndexOf("o")); // Último índice de la letra "o"
        System.out.println(texto.replace("Mundo", "Java")); // Reemplazar "Mundo" por "Java"

    }
}
