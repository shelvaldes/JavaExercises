package proyectoListas;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private static List<Product> products;

    //Método constructor
    public Inventory(){
        products = new LinkedList<>();
    }
    public static void newProduct(int ID, String name, int existence, double price){
        Product newProduct = new Product(ID, name, existence, price);

        boolean sucess = products.add(newProduct);
        if (sucess){
            System.out.println("El producto "+name+" fue añadido correctamente");
        } else {
            System.out.println("Pcurrió un problema al agregar el producto");
        }
    }

    public void addProduct(int ID){
        int productIndex = products.indexOf(new Product(ID));
        Product product = products.get(productIndex);
        int existenceTemp = product.getExistence();
        int newExistence = existenceTemp ++;
        product.setExistence(newExistence);
        System.out.println("\n" +
                "Se ha agregado une " +product.getName());
    }

    public static void printProducts(){
        System.out.println("Productos en almacén");
        products.forEach(System.out::println);
        System.out.println("\n\n");
    }
}
