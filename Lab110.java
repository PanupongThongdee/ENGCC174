import java.util.Scanner;
public class Lab110 {

  public static void main(String[] args) {
   
     Scanner input = new Scanner(System.in);

     System.out.print("Enter  Height : ");
     double  height = input.nextDouble();

     System.out.print("Enter  width : ");
     double  width = input.nextDouble();
     
     double Area =  value(height , width);
     System.out.println("answer =" + Area);

  }
  


public static double value(double h , double w){
  double sum = h * w ;
  return sum ;

}
 }
