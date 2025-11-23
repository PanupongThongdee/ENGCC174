import java.util.Scanner ;

public class lab107 {

    public static void main(String[] jv){ 
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Number for sum number: "); 
        int number =input.nextInt();
        int sum = 0 ;

        for(int i = 1 ; i <=number ; i ++ ){ 
            System.out.print("Enter Number : ");
             int inputnumber =input.nextInt();
             sum+=inputnumber; 
        }
        System.out.println("Answer = "+ sum);
    


    }
    
}
