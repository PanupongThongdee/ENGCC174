import java.util.Scanner;

 public class Lab105 { 
    public static void main(String[] text){ 
       Scanner enterNumber =new Scanner(System.in); 
       System.out.print("Enter Menu Number : ");
       int menu = enterNumber.nextInt(); 

       if(menu == 1){ 
          System.out.println("Americano");
       }
       else if(menu == 2){
          System.out.println("Latte");
       }
       else if(menu == 3){
          System.out.println("Espresso");
       }
       else if(menu == 4){
          System.out.println("Mocha");
       }
       else{
          System.out.println("Invalid Menu");
       }


    }
    
}
