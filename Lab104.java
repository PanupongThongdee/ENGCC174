import java.util.Scanner; //เรียกใช้คำสั่ง Scanner

public class Lab104 {
   public static void main(String[] text){ // main box
     Scanner sc = new Scanner(System.in);  //สร้างตัวแปร sc ไว้เก็บค่าจากคีย์บอร์ด
     System.out.print("Enter Score :");
     int Score=sc.nextInt(); // ตัวแปรScore ที่เก็บค่าจาก sc ที่รับมาจากแป้นพิมพ์

     if(Score >= 80 ){//ถ้ามากกว่า 80 คะแนน ได้ A
      System.out.println("A");
     }
     else if( Score >=70 ){//ถ้ามากกว่า 70 คะแนน ได้ B
      System.out.println("B");
     }
     else if(Score>=60 ){//ถ้ามากกว่า 60 คะแนน ได้ C
       System.out.println("C");
   }
   else if(Score>=50 ){//ถ้ามากกว่า 50 คะแนน ได้ D
       System.out.println("D");
   }
   else {//ถ้าต่ำกว่า 50 คะแนน ได้ F
    System.out.println("F");
   }
   }
} 