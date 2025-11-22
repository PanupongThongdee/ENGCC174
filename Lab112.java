import java.util.Scanner;
public class Lab112 {
    public static void main(String[] youAreGay){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value : ");
    int num = input.nextInt();
    int [] arr1 = new int[num];
    int [] arr2 = new int[num];

    for(int i = 0 ; i < num ; i++){
      System.out.print("Product ID  "+ (i+1)+":");
      arr1[i] = input.nextInt();
      System.out.print("Stock Quantity "+(i+1)+":");
      arr2[i] = input.nextInt();
    }
      boolean check = false ;
      int searchID = 0;
      searchID = input.nextInt();
      for(int i = 0 ; i < num ; i++){
        if( arr1[i] == searchID){
           System.out.println(arr2[i]);
           check = true;
           break;

       }
        
     }
        if( check != true){
           System.out.println("Product"+searchID +"not found");

       }
    }
}
