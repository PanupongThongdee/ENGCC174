import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) { // main 

    System.out.println("Enter is sum Number :");
    Scanner Length =new Scanner(System.in);//รับค่าจากแป้นพิมพ์
    Scanner Height =new Scanner(System.in);//รับค่าจากแป้นพิมพ์

    System.out.print("Enter Length : "); 
    double L1 =Length.nextDouble();//นำค่า Length จากแป้นพิมพ์ มาใส่ในตัวแปร L1
    System.out.print("Enter Height : "); 
    double H1 =Height.nextDouble();//นำค่า Height จากแป้นพิมพ์ มาใส่ในตัวแปร H1
    System.out.print("Answer =");
    System.out.print(L1*H1);//แสดงผลลัพธ์
  }
}

