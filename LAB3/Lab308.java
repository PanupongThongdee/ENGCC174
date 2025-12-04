package ENGCC174.LAB3;
import java.util.Scanner;

public class Lab308 {
  public static void main(String[] bad){
    Scanner input = new Scanner(System.in);
    System.out.print("name Product : ");
    String nameProduct = input.nextLine();
    System.out.print("enter getStork : ");
    int getStork = input.nextInt();
    InventoryItem InventoryItem = new InventoryItem(nameProduct,getStork);
    System.out.print("Enter round");
    int N = input.nextInt();
   

    for(int i = 0 ; i< N ; i++){
        input.nextLine();
         System.out.print("Enter Add or Sell :");
         String data = input.nextLine();

         if(data.equalsIgnoreCase("ADD") ){
            int number = input.nextInt();

            InventoryItem.addStock(number);
            
            
         }
         else if(data.equalsIgnoreCase("SELL") ){
            int number = input.nextInt();
            InventoryItem.sellStock(number);
         }
         
    }
        
         System.out.println("Final Stock : "+ InventoryItem.getStock());

  }  
}
class InventoryItem{
    private String ProductName ;
    private int stock ;

    public InventoryItem(String productName ,int initialStock){

        this.ProductName = productName ;

        if(initialStock >= 0){
            this.stock=initialStock;
        }
        else if (initialStock < 0){
            this.stock =0;
        }

    }
    public String getProductName(){
        return ProductName ;
    }
    public int getStock(){
        return stock;
    }
    public void addStock(int amount){
        if(amount > 0){
            stock += amount ;
            System.out.println("Stock added.");
        }
        else if(amount < 0){
            System.out.println("Invalid amount. ");
        }
    }
    public void sellStock(int amount){
        if(amount > 0 && amount <= stock){
            stock-=amount ;
            System.out.println("Sale successful.");
        }
        else if(amount > stock){
            System.out.println("Not enough stock.");
        }
         else if(amount <= 0){
            System.out.println("Invalid amount.");
        }
    }
}
