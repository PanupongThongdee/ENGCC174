import java.util.Scanner;

public class Lab101 {
  public static void main(String[] args) { 

    System.out.println("Enter is sum Number :");
    Scanner input =new Scanner(System.in);
    
    System.out.print("Enter num1 : "); 
    int n1 =input.nextInt();
    System.out.print("Enter num2 : "); 
    int n2 =input.nextInt();
    System.out.print("Answer =");
    System.out.print(n1+n2);
    input.close();
}

}