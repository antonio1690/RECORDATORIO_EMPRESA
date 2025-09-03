package EjerciciosJava;

public class EjerciciosOperadores {
    public static void main(String[] args) {
        // 1.Crea una variable con el resultado de cada opercion aritmetica
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        System.out.println();

        // 2.Crea una variable para cada tipo de operacion de asignacion
        int c = 10;
        c += 5; // Suma
        System.out.println("Suma: " + c);
        c -= 5; // Resta
        System.out.println("Resta: " + c);
        c *= 5; // Multiplicación
        System.out.println("Multiplicación: " + c);
        c /= 5; // División
        System.out.println("División: " + c);
        c %= 5; // Módulo
        System.out.println("Módulo: " + c);

        System.out.println();

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparacion
        System.out.println("Igualdad: " + (0 == c));
        System.out.println("Desigualdad: " + (a != b));
        System.out.println("Mayor que: " + (a > b));

        System.out.println();

        // 4.Imprime 3 comparaciones falsas con diferentes operadores de comparacion
        System.out.println("Igualdad: " + (1 == c));
        System.out.println("Desigualdad: " + (5 != b));
        System.out.println("Mayor que: " + (a < b));

        System.out.println();

        // 5.Utiliza el operador logico and
        System.out.println("AND lógico: " + (0 == c && 5 != b));

        System.out.println();

        // 6.Utiliza el operador logico or
        System.out.println("OR lógico: " + (0 == c || 5 != b));

        System.out.println();

        // 7.Utiliza el operador logico not
        System.out.println("NOT lógico: " + !(0 == c));

        System.out.println();

        // 8.Combina ambos operadores logicos
        System.out.println("Combinación: " + (0 == c && 5 != b || !(0 == c)));

        System.out.println();

        // 9.Imprime 3 ejemplos de uso de operadores unarios
        int d = 5;
        System.out.println("Unary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));
        System.out.println("Increment: " + (++d));

        System.out.println();

        // 10.Combina operadores aritmeticos,de comparacion y logicos
        System.out.println("Combinación: " + ((a + b > c) && (d - 1 < 5)));
    }
}
