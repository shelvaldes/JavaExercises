package estructurasDeDatos;

public class SimpleLinkedList {
    private Node first;

    public SimpleLinkedList(){
        this.first = null;
    }

    public  void push(Object obj){
        //este nuevo nodo será la cabeza de la lista enlazada simple
        Node newNode = new Node(obj);
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public Node pop(){
        Node temp = this.first;
        this.first = (Node) this.first.next();
        return temp;
    }

    public Node delete(Object val){
        //costo en rendimiento implícito
        //al principio, sólo hay un nodo, por eso inicia así
        Node currentNode = this.first;
        Node previousNode = this.first;

        while (!currentNode.value().equals(val)){
            if(currentNode.next() == null){
                return  null;
            }else{
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }

        if (currentNode == this.first) {
            this.first = this.first.next();
        }else{
            previousNode.setNext(currentNode.next());
        }
        return currentNode;
    }

    public  boolean isEmpty(){
        return (this.first == null);
    }

    public Node contains(Object val){
        Node currentNode = this.first;

        while (!currentNode.value().equals(val)){
            if (currentNode.next()== null){
                return null;
            }else {
                currentNode = currentNode.next();
            }
        }
        return currentNode;
    }

    public Node insert(Object value, Object newValue){
        Node newNode = new Node(newValue);
        Node currentNode = this.first;
        while (!currentNode.value().equals(value)){
            if(currentNode.next() == null){
                return null;
            }else {
                currentNode = currentNode.next();
            }
        }

        newNode.setNext(currentNode.next());
        currentNode.setNext(newNode);
        return newNode;
    }

    public void printContent(){
        Node currentNode = first;

        System.out.println("Mostrar elementos de la lista enlazada");
        while (currentNode != null){
            currentNode.showContent();
            currentNode = currentNode.next();
        }
    }
}
