    import java.util.Scanner ;

    public class Lab106 {

        public static void main(String[] soBad){ 

            Scanner mul = new Scanner(System.in); 
            System.out.print("Enter Number of multiplication table :");
            int num = mul.nextInt();
            for(int i = 1 ; i <=12 ; i++){ 
                 System.out.printf("%d * %d = %d\n",num ,i,(num*i));
                    
    }
}
}
