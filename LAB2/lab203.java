
import java.util.Scanner;

public class lab203 {
    public static class student {
        String studenId ;
        String studentName ;

        static int studentCount = 0;

            student (String id , String n ){
            this.studenId = id ;
            this.studentName = n ;
            
            studentCount++ ;
        }
        
        static void show(){
            System.out.println(studentCount);
        }

       
    }
    public static void main(String[] avg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int round = input.nextInt();
        student[]arr = new student[round];
        
       
        
        System.out.println("_________________");
        for(int i = 0 ; i < round ; i++){
            input.nextLine();
            System.out.print("Enter ID : ");
            String id =input.nextLine();
       
            System.out.print("Enter Name : ");
            String name= input.nextLine();
            
           arr[i] = new student(id,name);
            }
            student.show();
            input.close();
        }   
    
    }

