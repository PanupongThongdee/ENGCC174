package LAB4;
import java.util.Scanner;
public class lab402 {
    public static void main(String[] value){
        Scanner data = new Scanner(System.in);
        Product product = null ;

        System.out.print("Enter mode 1 or 2 : ");
        int mode = data.nextInt();
        if(mode == 1){
            data.nextLine();
            System.out.print("Enter name Product : ");
            String name1 = data.nextLine();
            product = new Product(name1);
            product.displayInfo();
        }
        else if(mode == 2){
            data.nextLine();
            System.out.print("Enter name Product : ");
            String name2 = data.nextLine();

            System.out.print("Enter name Price : ");
            Double price1 = data.nextDouble();

            product = new Product(name2,price1);
            product.displayInfo();
        }
       else{
        System.out.println("please Enter 1 or 2 :");
       }

       data.close();
       product = null;

    }
}
class Product{
    private String name ;
    private double price ;

    public Product (String name){
        this(name,0.0);
    }
    public Product (String name , double price){
        this.name = name ;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Product : "+ name);
        System.out.println("Price : "+ price);
    }
}
