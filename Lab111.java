import java.util.Scanner;

public class Lab111 {

    public static void main(String[] nigga) {
       
    Scanner input =new Scanner(System.in);
    System.out.print("Enter number : ");
    int N = input.nextInt();
    int[] arr = new int[N];
    
    
    for(int i = 0 ; i< N ; i++){
      arr[i] = input.nextInt();
     
    }
     int sumArray = sumArray(arr);
     System.out.println("Answer = "+ sumArray);

    
}

public static int sumArray(int [] array){
    int sum = 0 ;
    for(int i = 0 ; i< array.length ; i++){
    sum += array[i];
      
    }
    return sum ;
}







    
    

}