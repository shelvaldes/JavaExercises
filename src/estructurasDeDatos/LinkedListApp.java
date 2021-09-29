package estructurasDeDatos;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(12.4);
        list.push(4.2);

        list.printContent();
        Node nodo = list.insert(12.4, 78.4);
        if (nodo == null){
            System.out.println("No se pudo insertar un nuevo nodo");
        }else {
            System.out.println("El nodo se ha insertado");
        }

        System.out.println("El nuevo contenido de la lista es:");
        list.printContent();

        nodo = list.contains(12.4);
        //System.out.println(list.contains(12.4));

        if(nodo == null){
            System.out.println("El nodo no se ha encontrado");
        }else {
            System.out.println("El valor se ha encontrado en la lista");
        }

        System.out.println("\nEliminación de nodos");
        while (!list.isEmpty()){
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }
        list.printContent();

        list.push("Cat");
        list.push("Dog");
        list.printContent();
        list.delete("Dog");
        System.out.println("No perros");
        list.printContent();

    }
}
