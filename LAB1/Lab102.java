import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {  

    System.out.println("Enter is sum Number :");
    Scanner Length =new Scanner(System.in);
    Scanner Height =new Scanner(System.in);

    System.out.print("Enter Length : "); 
    double L1 =Length.nextDouble();
    System.out.print("Enter Height : "); 
    double H1 =Height.nextDouble();
    System.out.print("Answer =");
    System.out.print(L1*H1);
  }
}

