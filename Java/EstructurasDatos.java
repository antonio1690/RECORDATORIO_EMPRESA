package Java;

import java.util.ArrayList;

public class EstructurasDatos {
    public static void main(String[] args) {
        // ARRAYS: Declaracion y creacion
        int[] numeros = new int[5]; // Declarar un array de enteros
        String[] nombres = { "Juan", "Maria", "Pedro" }; // Declarar y crear un array de Strings

        // ACCESO A ELEMENTOS DEL ARRAY
        System.out.println("Primer número: " + numeros[0]);
        System.out.println("Segundo nombre: " + nombres[1]);

        // MODIFICAR ELEMENTOS DEL ARRAY (Tenemos que coger el indice que queremos
        // modificar y asignarle un nuevo valor)
        numeros[0] = 10;
        nombres[1] = "Maria Garcia";

        System.out.println("Primer número modificado: " + numeros[0]);
        System.out.println("Segundo nombre modificado: " + nombres[1]);

        // LISTAS: Declaracion y las 2 formas de creacion
        ArrayList<Integer> listaNumeros = new ArrayList<>(); // Forma clasica
        var listaNombres = new ArrayList<String>(); // Forma nueva con var

        // AÑADIR ELEMENTOS A LA LISTA (Con el metodo add)
        listaNumeros.add(10);
        listaNombres.add("Juan");

        // ACCEDER A ELEMENTOS DE LA LISTA
        System.out.println("Primer número de la lista: " + listaNumeros.get(0));
        System.out.println("Primer nombre de la lista: " + listaNombres.get(0));

        // MODIFICAR ELEMENTOS DE LA LISTA
        listaNumeros.set(0, 20);
        listaNombres.set(0, "Maria");

        System.out.println("Primer número de la lista modificado: " + listaNumeros.get(0));
        System.out.println("Primer nombre de la lista modificado: " + listaNombres.get(0));

        // ELIMINAR ELEMENTOS DE LA LISTA (Con el metodo remove)
        // listaNumeros.remove(0);
        // listaNombres.remove(0);

        // System.out.println("Lista de números después de eliminar: " + listaNumeros);
        // System.out.println("Lista de nombres después de eliminar: " + listaNombres);

        // BUSCAR ELEMENTOS EN LA LISTA (Con el metodo contains)
        boolean existeNumero = listaNumeros.contains(20);
        boolean existeNombre = listaNombres.contains("Maria");

        System.out.println("¿Existe el número 20 en la lista? " + existeNumero);
        System.out.println("¿Existe el nombre 'Maria' en la lista? " + existeNombre);

        // MAS METODOS DE ARRAYLIST
        // Obtener el tamaño de la lista
        int tamañoListaNumeros = listaNumeros.size();
        int tamañoListaNombres = listaNombres.size();

        System.out.println("Tamaño de la lista de números: " + tamañoListaNumeros);
        System.out.println("Tamaño de la lista de nombres: " + tamañoListaNombres);

        // Limpiar la lista
        // listaNumeros.clear();
        // listaNombres.clear();

        // Verificar si las listas están vacías
        boolean listasVacias = listaNumeros.isEmpty() && listaNombres.isEmpty();
        System.out.println("¿Las listas están vacías? " + listasVacias);

    }
}
