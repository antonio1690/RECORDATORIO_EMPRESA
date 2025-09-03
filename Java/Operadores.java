package Java;

public class Operadores {
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println();

        // OPERADORES DE ASIGNACION
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
        System.out.println(c);

        System.out.println();

        // OPERADORES DE COMPARACION
        System.out.println("Igualdad: " + (a == b));
        System.out.println("Desigualdad: " + (a != b));
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Mayor o igual que: " + (a >= b));
        System.out.println("Menor o igual que: " + (a <= b));

        // OPERADORES LOGICOS
        System.out.println("AND lógico: " + (a > b && b < 10));
        System.out.println("OR lógico: " + (a > b || b < 10));
        System.out.println("NOT lógico: " + !(a > b));

        System.out.println();

        // OPERADORES UNARIOS
        int d = 5;
        System.out.println("Valor original: " + d);
        System.out.println("Incremento: " + (++d));
        System.out.println("Decremento: " + (--d));
        /*
         * Si ponemos el operador unario antes de la variable, se llama pre-incremento o
         * pre-decremento.
         * Si lo ponemos después, se llama post-incremento o post-decremento.
         */
    }
}
