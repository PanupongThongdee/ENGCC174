import java.util.Scanner;//เรียกใช้คำสั่ง Scanner

public class Lab108 {
    public static void main(String[] nigger){
       Scanner enterNumber =new Scanner(System.in); 
       System.out.print("Enter Number :");
       int number=enterNumber.nextInt();
       int[] arryNumber = new int[number];
       for(int i = 0 ;i < number ;i++ ){ 
          arryNumber[i] =enterNumber.nextInt(); 
        
    }
    int max = 0;
    
      for(int i = 0 ;i < number ; i++){
           if(arryNumber[i] > max){

           max = arryNumber[i];

       }
    }
    System.out.println(max);
    
    }
}









