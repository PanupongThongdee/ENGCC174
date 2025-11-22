import java.util.Scanner;//เรียกใช้คำสั่ง Scanner

public class Lab108 {
    public static void main(String[] text){ //main
    Scanner enterNumber =new Scanner(System.in);    //สร้างตัวแปร enterNumber ไว้เก็บค่าจากคีย์บอร์ด
    System.out.print("Enter Number :");
    int number=enterNumber.nextInt(); //สร้างตัวแปร number ที่เป็นประเภท int ไว้เก็บค่าจาก entenNumber ที่รับมาจากแป้นพิมพ์
    int[] arryNumber = new int[number]; //สร้างตัวแปร arryNumber เป็น array และกำหนดความกว้างช่อง index ด้วยตัวแปร number 
    for(int i = 0 ;i < number ;i++ ){ // loop i  ไว้กรอกตัวเลขใส่ในแต่ละindex
      arryNumber[i] =enterNumber.nextInt();  //กรอกตัวเลขใส่ในแต่ละ index
        
    }
    int max = 0;
    for(int i = 0 ;i < number ; i++){
       if(arryNumber[i] > max){

        max = arryNumber[i];

       }
    }
    System.out.println(max);

     
    }
}
