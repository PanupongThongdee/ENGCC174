import java.util.Scanner;

public class Lab109 {
    public static void main(String[] helloWorld){
         Scanner enterNum =new Scanner(System.in);
         System.out.print("Enter Number : ");
         int N = enterNum.nextInt();
         double[] index = new double[N];
         double sum = 0;

         for(int i = 0 ; i < N ; i++){
             index[i] = enterNum.nextDouble();
             sum += index[i];
         }
         
         System.out.println(sum/N);
         enterNum.close();
         
    }
}
