package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab304 {
    public static void main(String[] gay){
        Scanner  input = new Scanner (System.in);
        System.out.print("Enter N : ");
        int num = input.nextInt();
        for(int i = 0 ; i < num ; i ++){
            System.out.print("Enter Data : ");
            String data = input.next();
            Product product = new Product(data);
        }
        System.out.println(Product.getProductCount());
        input.close();
    }
}
class Product{
    private String name ;
    private static int productCount = 0 ;
    Product(String n){
        this.name = n;
        productCount++;
    }
    public String getName(){
        return name ;
    }
    public static int getProductCount(){
        return productCount ;
    }
}
