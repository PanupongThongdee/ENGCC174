import java.util.Scanner;
public class lab210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sum items: ");
        int sumItems = input.nextInt();
        ShoppingCart cart = new ShoppingCart();
        for(int i = 0; i < sumItems; i++){
            System.out.print("Product " + (i + 1) + ": ");
            String name = input.next();

            System.out.print("Price : ");
            double price = input.nextDouble(); 

            Product product = new Product(name, price);
            cart.addItem(product);
}         
            double totalPrice = cart.calculateTotalPrice();
            System.out.println("Total Price: " + totalPrice);

    }
}

class Product {
    String name;
    double price;
    
    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart{
    Double[] items = new Double[10] ;
    int itemCount = 0;

    public void addItem(Product product){
        if(itemCount < items.length){
            items[itemCount] = product.price;
            itemCount++;
            }

    }
    public  double calculateTotalPrice(){
        double total = 0;
        for(int i = 0; i < itemCount; i++){
            total += items[i];
        }
        return total;
    }
}

