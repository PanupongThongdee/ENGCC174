import java.util.Scanner; //นำเข้าคำสั่งScanner

public class Lab103 { 
    public static void main(String[] text){ // main 
      Scanner number = new Scanner(System.in);//รับค่าจากแป้นพิมพ์
      System.out.print("Enter number for Guess the numbers  Odd or Even  :");  
      int num = number.nextInt();
      
      if(num %2 == 1){//condition ถ้า num หาร 2 เอาเศษ ถ้าเศษเท่ากับ 1 จะเป็นเลขคี่ ถ้าเศษเท่ากับ 0 จะเป็นเลขคู่
        System.out.println("Odd");
      }
      else {
         System.out.println("Even");
      }
    }
}
