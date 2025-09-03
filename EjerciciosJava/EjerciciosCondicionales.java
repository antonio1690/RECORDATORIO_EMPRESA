package EjerciciosJava;

public class EjerciciosCondicionales {
    public static void main(String[] args) {
        // 1.Establece la edad de un usuario y muestra si puede votar o no
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }

        System.out.println();

        // 2.Declara 2 numeros y muestra cual es mayor o si son iguales
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales");
        }
        System.out.println();

        // 3.Dado un numero, verifica si es positivo,negativo o cero
        int numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        System.out.println();

        // 4.Crea un programa que diga si un numero es par o impar
        int numeroParImpar = 5;
        if (numeroParImpar % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println();

        // 5.Verifica si un numero esta en el rango de 1 a 100
        int numeroRango = 50;
        if (numeroRango >= 1 && numeroRango <= 100) {
            System.out.println("El número está en el rango de 1 a 100");
        } else {
            System.out.println("El número no está en el rango de 1 a 100");
        }

        System.out.println();

        // 6.Declara una variable con el dia de la semana y muestra su nombre con switch
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }

        System.out.println();

        // 7.Simula un sistema de notas: muestra "Sobresaliente","Aprobado" o "suspenso"
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        System.out.println();

        // 8.Escribe un programa que determine si puedes entrar al cine, debes tener al
        // menos 15 años o ir acompañado
        int edadCine = 14;
        boolean acompañado = false; //

        if (edadCine >= 15 || acompañado) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }

        System.out.println();

        // 9.Crea un programa que diga si una letra es vocal o consonante(char)
        char letra = 'a';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }

        System.out.println();

        // 10.Usa 3 variables a,b,c y muestra la mayor
        int a = 5;
        int b = 10;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("La variable mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("La variable mayor es: " + b);
        } else {
            System.out.println("La variable mayor es: " + c);
        }
    }
}
