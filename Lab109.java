import java.util.Scanner;

public class Lab109 {
    public static void main(String[] helloWorld){
         Scanner EnterNum =new Scanner(System.in);
         System.out.print("Enter Number : ");
         int N = EnterNum.nextInt();
         double[] index = new double[N];
         double sum = 0;

         for(int i = 0 ; i < N ; i++){
         index[i] = EnterNum.nextDouble();
         sum += index[i];
         }
         
         System.out.println(sum/N);

    }
}
