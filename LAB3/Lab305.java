package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab305 {
    public static void main (String[] gai){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter connection : ");
        String Connection =input.nextLine();

        DatabaseConnection data = new DatabaseConnection(Connection);
        data.connect();
        data.disconnect();
        data.disconnect();
        System.out.println(data.isConnected());
        
    }
}
class DatabaseConnection {
    private String connectionString ;
    private boolean Connected ;

         public DatabaseConnection(String connectionString){
             this.connectionString = connectionString; 
             this.Connected = false ;
    }
         public boolean isConnected(){
             return Connected ;
    }
         public void connect(){
              if (Connected == false){
                 this.Connected = true ;
                 System.out.println("Connect to : " + connectionString);
        }
             else if(Connected == true){
                System.out.println("Already connected. ");
        }
    }
            public void disconnect(){
                if(Connected == true){
                  this.Connected = false ;
                  System.out.println("Disconnected.");
        }
                else if (Connected == false){
                  System.out.println("Already disconnected.");
        }
    } 
}
