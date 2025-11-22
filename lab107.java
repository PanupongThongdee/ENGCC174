import java.util.Scanner ;//เรียกใช้คำสั่ง Scanner

public class lab107 {

    public static void main(String[] java){ 
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Number for sum number: "); 
        int number =input.nextInt();
        int i=0 ;

        for(int num = 1 ; num<=number ; num++ ){ 
        System.out.print("Enter Number : ");
        int sum =input.nextInt();
        i+=sum; 
        }
        System.out.println("Answer = "+i);
    


    }
    
}
