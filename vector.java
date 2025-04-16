import java.util.Vector;
class Product {
    String name;
    double price;
    String category;
    public Product( String name, double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

}
public class vector  {
    private Vector<Product> inventory;
    public vector () {
        inventory = new Vector<>();
    }
    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }
    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println("Name: "+ product.name + ", Price: " + product.price +",Category: " + product.category );
        }
    }
    public static void main(String[] args) {
        vector  manager = new vector ();

        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("Cricket Bats", 550, "Sports")
        ;
        manager.addProduct("Book", 920, "Books");

        manager.displayInventory();

        manager.removeProduct("Book");

        manager.displayInventory();
        manager.removeProduct("Laptop");

        manager.displayInventory();
    }
}

//output
//Inventory:
//Name: Laptop, Price: 40000.0,Category: Electronics
//Name: Cricket Bats, Price: 550.0,Category: Sports
//Name: Book, Price: 920.0,Category: Books
//Inventory:
//Name: Laptop, Price: 40000.0,Category: Electronics
//Name: Cricket Bats, Price: 550.0,Category: Sports
//Inventory:
//Name: Cricket Bats, Price: 550.0,Category: Sports
//
//Process finished with exit code 0
