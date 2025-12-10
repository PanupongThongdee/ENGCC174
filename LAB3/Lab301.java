
import java.util.Scanner ;
public class Lab301 {
    
    public static void main(String[] nigga){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        User user = new User(name);
        System.out.println(user.getUsername());
    }
}
class User {
    private String username ;
    User(String name){
        this.username = name;
    }
    public String getUsername(){
        return username ;
    }
}
