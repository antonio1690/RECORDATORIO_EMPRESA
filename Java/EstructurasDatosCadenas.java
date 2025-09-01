package Java;

public class EstructurasDatosCadenas {
    public static void main(String[] args) {
        // Crear una variable de tipo String
        String nombre = "Ricardo";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));

        // Crear una variable de tipo char
        char inicial = nombre.charAt(0);
        System.out.println("La inicial de mi nombre es " + inicial);

        // Crear una variable de tipo boolean
        boolean esEstudiante = true;
        System.out.println("¿Es estudiante? " + esEstudiante);
    }

    /*
     * Un char es un solo caracter.
     * El tipo String es un tipo especial que consiste en multiple chars.
     */
}