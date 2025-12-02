package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab303 {
    public static void main(String[] nigga){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = input.nextLine();
        System.out.print("Enter New password : ");
        String newpass = input.nextLine ();

        User1 dataUser = new User1 (password);
        dataUser.setPassword(newpass);
        System.out.println(dataUser.getPassword());
        input.close();

    }
}

class User1 {
    private String password;

    User1(String initialpassword){
        this.password = initialpassword;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String newpass){
        if(newpass.length() >= 8){
            this.password = newpass;
              System.out.println("Password updated. ");
            
        }
        else if(newpass.length() < 8){
            System.out.println("Password is too short. ");
           
        }
    }
}