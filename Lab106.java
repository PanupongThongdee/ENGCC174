    import java.util.Scanner ;//เรียกใช้คำสั่ง Scanner

    public class Lab106 {

        public static void main(String[] text){ //main box

            Scanner numberMultiplication = new Scanner(System.in); //สร้างตัวแปร numberMultiplication ไว้เก็บค่าจากคีย์บอร์ด

            System.out.print("Enter Number of multiplication table :");

            int num = numberMultiplication.nextInt();//สร้างตัวแปร num ที่เป็นประเภท int ไว้เก็บค่าจาก numberMultiplication ที่รับมาจากแป้นพิมพ์

            for(int fristLoop = 0 ; fristLoop <=12 ; fristLoop++){ //forLoop 

                System.out.printf("%d * %d = %d\n",num ,fristLoop,(num*fristLoop));//แสดงค่าคำตอบ
                    
    }
}
}
