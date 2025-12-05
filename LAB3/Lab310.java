package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab310 {
    public static void main(String[] java){
        Scanner data = new Scanner(System.in);
        System.out.print("Enter minLendth1 : ");
        int minLendth1 = data.nextInt();
        data.nextLine();
        System.out.print("Enter user1_name : ");
        String user1_name9 = data.nextLine();

        System.out.print("Enter user1_pass : ");
        String user1_pass9 = data.nextLine();

        System.out.print("Enter user2_name : ");
        String user2_name9 = data.nextLine();

        System.out.print("Enter user2_pass : ");
        String user2_pass9 = data.nextLine();

        System.out.print("Enter minLendth2 : ");
        int minLendth2 = data.nextInt();

        data.nextLine();
        System.out.print("Enter user2_newPass : ");
        String user2_newPass = data.nextLine();

        User.setMinLength(minLendth1);
        User user1 = new User(user1_name9 , user1_pass9);
        User user2 = new User(user2_name9 , user2_pass9);
        User.setMinLength(minLendth2);
        user2.setPassword( user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
        data.close();

    }
}
class User{
    private String username9 ;
    private String password9 ;


    private static int minPasswordLength1 = 8;

   
    public User(String username, String password){

        if(password == null || password.isEmpty()){
            this.password9 = "invalid" ;
            System.out.println("Created failed" );
         }

        else if(password.length() >= minPasswordLength1){
            this.username9 = username ;
            this.password9 = password ;
            System.out.println( " created successful");
       }
        else{
            this.password9 = "invalid" ;
            System.out.println("Created failed" );
       }

    }

    public String getPassword(){
        return password9 ;
    }
    
    public void setPassword(String newPassword){
        if(newPassword == null || newPassword.isEmpty()){
            this.password9 = "invalid" ;
            System.out.println("Update failed.");

        }

        else if(newPassword.length() >= minPasswordLength1){
            this.password9 = newPassword ;
            System.out.println("Update successful.");
        }
        else{
            System.out.println("Update failed.");
        }


    }


    public static void setMinLength(int length){
        if (length < 4){
            System.out.println("Invalid length");
        }
        else if(length >= 4){

            minPasswordLength1 = length;
            System.out.println("New min length set to"+ minPasswordLength1);
        }
    }
    public static int getMinLength(){
        return minPasswordLength1 ;
    }
   
}
