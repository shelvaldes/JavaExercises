package estructurasDeDatos;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {
        //Creación de Array list
        List<String> listaColores = new java.util.ArrayList<>();
        // List<String> listaColores = new ArrayList<>(); así lo puso pero no jala

        //Creación con la clase Arrays
        String[] nombres = {"Ana", "Betty"};

        List<String> listaNombres = Arrays.asList(nombres);

        //Añadir elementos individuales
        listaColores.add("Amarillo");
        listaColores.add("Púrpura");
        listaColores.add("Menta");
        listaColores.add("Verde Manzana");

        //Construir lista a partir de otra lista
        List<String> elementos = new java.util.ArrayList<>(listaColores);
        //igual aquí

        //Añadir elementos de otra colección
        elementos.addAll(listaNombres);

        System.out.println("Lista de nombres");
        listaNombres.forEach(System.out::println);
        System.out.println("Lista colores");
        listaColores.forEach(System.out::println);
        System.out.println("Lista elementos");
        elementos.forEach(System.out::println);

        //Iteración a través de ArrayList
        //iterator o list iterator
        ListIterator<String> iterador =  listaColores.listIterator();

        System.out.println("\n\nRecorrido con Iterador");
        while(iterador.hasNext()){
            System.out.println("color "+iterador.next());
        }

        System.out.println("\n\nRecorrido con Iterador inverso");
        while(iterador.hasPrevious()){
            System.out.println("color "+iterador.previous());
        }

        System.out.println("\n\nRecorrido con Iterador");
        while(iterador.hasNext()){
            if (iterador.next().equals("Amarillo"))
            iterador.remove();
        }

        System.out.println("\n\nRecorrido con Iterador sin amarillo");
        //la segunda vez del while has next contó las anteriores, por eso no saca nada
        /*while(iterador.hasNext()){
            System.out.println("color "+iterador.next());
        }*/
        for (ListIterator<String> iter = listaColores.listIterator(); iter.hasNext();){
            System.out.println("colores: " + iter.next());
        }
    }
}
