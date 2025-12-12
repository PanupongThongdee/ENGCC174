package LAB4;
import java.util.Scanner;
public class lab401 {
    
    public static void main(String[] java){
        Scanner data = new Scanner(System.in);
        Book process = null ;
        System.out.print("Enter number ");
        int n = data.nextInt();

        if(n == 1){
            data.nextLine();
            System.out.print("Enter Title :");
            String title = data.nextLine();

            process = new Book(title);
            process.display();
        }
        else if(n == 2){
            data.nextLine();
            System.out.print("Enter Title :");
            String title = data.nextLine();

            System.out.print("Enter author :");
            String author = data.nextLine();

            process = new Book( title , author );
            process.display();

        }
        else{
            System.out.println("Please enter the number 1 or 2 : ");
        }
        
        data.close();
        process = null;
    }
}
class Book {
    private String title ;
    private String author ;

    public Book(String title){
        this.title = title ;
        this.author = "unknown" ;
    }
    public Book(String title , String author){
        this.title = title ;
        this.author = author ;
    }
    public void display(){
        System.out.println("Title : " + title +"\n"+"Author : "+author) ;
        
    }
}



