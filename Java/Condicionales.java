package Java;

public class Condicionales {
    public static void main(String[] args) {

        // CONDICIONALES SENTENCIA IF CON ELSE IF Y ELSE
        int edad = 18;
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad == 18) {
            System.out.println("Tienes 18 años");
        } else {
            System.out.println("Eres mayor de edad");
        }

        System.out.println();

        // CONDICIONAL SWITCH
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break; // Fin del caso 1
            case 2:
                System.out.println("Martes");
                break; // Fin del caso 2
            case 3:
                System.out.println("Miércoles");
                break; // Fin del caso 3
            case 4:
                System.out.println("Jueves");
                break; // Fin del caso 4
            case 5:
                System.out.println("Viernes");
                break; // Fin del caso 5
            case 6:
                System.out.println("Sábado");
                break; // Fin del caso 6
            case 7:
                System.out.println("Domingo");
                break; // Fin del caso 7
            default: // Si no se cumple ningun caso
                System.out.println("Día inválido");
                break;
        }

    }
}
