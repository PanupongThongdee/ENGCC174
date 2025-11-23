import java.util.Scanner; 

public class Lab104 {
   public static void main(String[] text){
     Scanner value = new Scanner(System.in); 
     System.out.print("Enter Score (0-100) :");
     int Score=value.nextInt();

     if(Score >= 80 ){
      System.out.println("A");
     }
     else if( Score >=70 ){
      System.out.println("B");
     }
     else if(Score>=60 ){
       System.out.println("C");
   }
     else if(Score>=50 ){
       System.out.println("D");
   }
     else {
       System.out.println("F");
   }
   value.close();
   }
   
} 