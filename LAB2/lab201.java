package LAB2;
import java.util.Scanner;

public class lab201 {


    public static class Student
{
    private String studentId ;
    private String studentName ;

    public Student (String id, String name) {
       this.studentId = id;
       this.studentName = name;
   
    }
    public void showValue(String id, String name) {

        System.out.println("------------------------------");
         System.out.println(this.studentId);
         System.out.println(this.studentName);
    }
}
   
    public static void main(String[] args) {


       Scanner input =new Scanner(System.in);
       System.out.print("Enter Student ID :");
       String id =  input.nextLine();
       System.out.print("Enter Student Name :");
       String name =  input.nextLine();

       Student value = new Student (id, name);

       value.showValue(id, name);

    }
}