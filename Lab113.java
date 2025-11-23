import java.util.Scanner;

public class Lab113 {
    public static void main(String[] exe){
        Scanner input = new Scanner(System.in);
        System.out.print("enter Row : ");
        int R =input.nextInt();
        System.out.print("enter Colume : ");
        int C =input.nextInt();
        int[][] array = new int[R][C];

        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
             array[i][j]=input.nextInt();
            }
        }
         int coutNumber = 0 ;

        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                 if(array[i][j] == 1){
                 coutNumber ++;
            }
            }
        }
          System.out.println("output = "+ coutNumber);
    }
    
}
