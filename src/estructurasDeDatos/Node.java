package estructurasDeDatos;

/**
 * Objeto Nodo creado en casa de miau. Qué bonita la documentación. Ayñ!
 */
public class Node {
    private  Object data;
    private Node next;

    //constructor
    public Node(Object dato){
        this.data = dato;
    }

    public Object value(){
        return  this.data;
    }

    public Node next(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public void showContent(){
        System.out.println("Value: "+data);
    }
}
