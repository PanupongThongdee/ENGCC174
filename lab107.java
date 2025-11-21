import java.util.Scanner ;//เรียกใช้คำสั่ง Scanner

public class lab107 {

    public static void main(String[] java){ //main
        Scanner entenNumber =new Scanner(System.in);//สร้างตัวแปร  entenNumber ไว้เก็บค่าจากคีย์บอร์ด
        System.out.print("Enter Number for sum number: "); 
        int number =entenNumber.nextInt();//สร้างตัวแปร number ที่เป็นประเภท int ไว้เก็บค่าจาก entenNumber ที่รับมาจากแป้นพิมพ์
        int i=0 ;//i = 0 เพราะเอาไว้รวมผลลัพธ์ทั้งหมด

        for(int num = 1 ; num<=number ; num++ ){  //loopตาม ตัวเลขตามnumber ที่่กรอกมาเพื่อนำตัวเลขมารวมกัน
            System.out.print("Enter Number : ");
            int sum =entenNumber.nextInt();//กรอกตัวเลขที่ต้องการบวกกัน
            i+=sum; //บวกเรื่อยๆจนกว่าจะสิ้นสุดloop
             
        }
        System.out.println("Answer = "+i);//แสดงค่าหลังจากออกloop
    


    }
    
}
