import java.util.Scanner;

 public class Lab105 { 
    public static void main(String[] java){ 
       Scanner input =new Scanner(System.in); 
       System.out.print("Enter Menu Number : ");
       int x = input.nextInt(); 

       if(x == 1){ 
          System.out.println("Americano");
       }
       else if(x == 2){
          System.out.println("Latte");
       }
       else if(x == 3){
          System.out.println("Espresso");
       }
       else if(x == 4){
          System.out.println("Mocha");
       }
       else{
          System.out.println("Invalid Menu");
       }


    }
    
}
