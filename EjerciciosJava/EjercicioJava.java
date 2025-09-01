package EjerciciosJava;

import java.util.Scanner;

public class EjercicioJava {
    public static void main(String[] args) {
        // EJERCICIO DE HOLA MUNDO
        System.out.println("Ejercicio Hola Mundo");
        System.out.println("Hola, Mundo!");

        // EJERCICIO DE SUMA DE NUMEROS DESDE LA CONSOLA
        System.out.println("Suma de numeros desde la consola");
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int num1 = leer.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}
