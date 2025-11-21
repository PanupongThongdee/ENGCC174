import java.util.Scanner;//เรียกใช้คำสั่ง Scanner

 public class Lab105 { //class หลัก
    public static void main(String[] text){ // main box
       Scanner enterNumber =new Scanner(System.in); //สร้างตัวแปร EnterNumber ไว้เก็บค่าจากคีย์บอร์ด
       System.out.print("Enter Menu Number : ");
       int menu = enterNumber.nextInt(); //สร้างตัวแปร menu ที่เป็นประเภท int ไว้เก็บค่าจาก EnterNumber ที่รับมาจากแป้นพิมพ์

       if(menu == 1){ //นำค่าจากตัวแปรmenuมาเช็ค ถ้าตรวจสอบได้ 1 ก็จะแสดงผลข้อความ
          System.out.println("Americano");
       }
       else if(menu == 2){//นำค่าจากตัวแปรmenuมาเช็ค ถ้าตรวจสอบได้ 2 ก็จะแสดงผลข้อความ
          System.out.println("Latte");
       }
       else if(menu == 3){//นำค่าจากตัวแปรmenuมาเช็ค ถ้าตรวจสอบได้ 3 ก็จะแสดงผลข้อความ
          System.out.println("Espresso");
       }
       else if(menu == 4){//นำค่าจากตัวแปรmenuมาเช็ค ถ้าตรวจสอบได้ 4 ก็จะแสดงผลข้อความ
          System.out.println("Mocha");
       }
       else{//นำค่าจากตัวแปรmenuมาเช็ค ถ้าตรวจสอบได้นอกเหนือจากเงื่อนไขข้างบน ก็จะแสดงผลข้อความ "Invalid Menu"
          System.out.println("Invalid Menu");
       }


    }
    
}
