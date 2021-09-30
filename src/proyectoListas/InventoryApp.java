package proyectoListas;
import java.util.Scanner;


public class InventoryApp {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int op;
        do {
            System.out.println("\n Menu · Manejo de inventarios \t");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");

            System.out.println("\nSelecciona: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    printProducts();
                    break;
            }
        }while (op !=6);
    }

    private static void newProduct(){
        System.out.println("ID del producto: ");
        int ID = sc.nextInt();

        System.out.println("Nombre de producto: ");
        String name = sc.next();

        System.out.println("Existencia inicial del producto: ");
        int existence = sc.nextInt();

        System.out.println("Precio del producto; ");
        double price = sc.nextDouble();

        Inventory.newProduct(ID, name, existence, price);
    }

    private static void addProduct(){

    }

    private static void deleteProduct(){

    }

    private static void updateProductPrice(){

    }

    private static void printProducts(){
        Inventory.printProducts();
    }


}
