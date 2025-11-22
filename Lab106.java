    import java.util.Scanner ;

    public class Lab106 {

        public static void main(String[] text){ 

            Scanner numberMultiplication = new Scanner(System.in); 

            System.out.print("Enter Number of multiplication table :");

            int num = numberMultiplication.nextInt();

            for(int fristLoop = 1 ; fristLoop <=12 ; fristLoop++){ 

            System.out.printf("%d * %d = %d\n",num ,fristLoop,(num*fristLoop));
                    
    }
}
}
