package EjerciciosJava;

public class EjercicioJavaVariables {
    public static void main(String[] args) {
        // 1.Crear una variable de tipo String y asignarle tu nombre
        String miNombre = "Antonio";
        // 2.Crear una variable tipo int y asignarle tu edad
        int miEdad = 30;
        // 3.Crea una variable tipo double con la altura
        double miAltura = 1.75;
        // 4.Declara una variable de tipo boolean que indique si te gusta estudiar
        boolean meGustaEstudiar = true;
        // 5.Declara una constante con tu email
        final String MI_EMAIL = "antonio@example.com";
        // 6.Crea una variable de tipo char y guardale tu inicial
        char miInicial = 'A';
        // 7.Declara una variable de tipo String con tu localidad y cambia su valor e
        // imprimelo
        String miLocalidad = "Madrid";
        System.out.println("Mi localidad es " + miLocalidad);
        miLocalidad = "Barcelona";
        System.out.println("Ahora vivo en " + miLocalidad);
        // 8.Crea una variable int llamada a,otra b, e imprime la suma de los 2
        int a = 5;
        int b = 10;
        System.out.println("La suma de a y b es " + (a + b));
        // 9.Imprime el tipo de 2 variables creadas anteriormente
        System.out.println("El tipo de la variable miEdad es " + ((Object) miEdad).getClass().getSimpleName());
        System.out.println("El tipo de la variable miAltura es " + ((Object) miAltura).getClass().getSimpleName());
        // 10.Intenta declarar una variable sin inicializar y luego dale un valor antes
        // de imprimir
        int miVariable;
        miVariable = 15;
        System.out.println("El valor de miVariable es " + miVariable);
    }
}
