import java.util.Scanner; // นำเข้าคำสั่งScanner

public class Lab101 { // ห้องขนาดใหญ่
  public static void main(String[] args) { // main 

    System.out.println("Enter is sum Number :");
    Scanner num1 =new Scanner(System.in);//รับค่าจากแป้นพิมพ์
    Scanner num2 =new Scanner(System.in);//รับค่าจากแป้นพิมพ์

    System.out.print("Enter num1 : "); 
    int n1 =num1.nextInt();//นำค่าจากแป้นพิมพ์ มาใส่ในตัวแปร n1
    System.out.print("Enter num2 : "); 
    int n2 =num2.nextInt();//นำค่าจากแป้นพิมพ์ มาใส่ในตัวแปร n2
    System.out.print("Answer =");
    System.out.print(n1+n2);//แสดงผลลัพธ์
  }
}