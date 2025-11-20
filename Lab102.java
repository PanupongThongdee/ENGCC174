import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) { // main 

    System.out.println("Enter is sum Number :");
    Scanner Length =new Scanner(System.in);//รับค่าจากแป้นพิมพ์
    Scanner Height =new Scanner(System.in);//รับค่าจากแป้นพิมพ์

    System.out.print("Enter num1 : "); 
    double L1 =Length.nextDouble();//นำค่าจากแป้นพิมพ์ มาใส่ในตัวแปร n1
    System.out.print("Enter num2 : "); 
    double H1 =Height.nextDouble();//นำค่าจากแป้นพิมพ์ มาใส่ในตัวแปร n2
    System.out.print("Answer =");
    System.out.print(L1*H1);//แสดงผลลัพธ์
  }
}

