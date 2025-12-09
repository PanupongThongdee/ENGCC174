import java.util.Scanner;

public class Lab310 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Emter number :");
     int n = input.nextInt();

     for(int i=0 ; i<n ; i++){

        System.out.print("Emter log level :");
        String data = input.next();
        int value =input.nextInt();
        input.nextLine();
        if(data.equalsIgnoreCase ("SET")){
            SystemLogger.setLogLevel(value);
        }
        else if(data.equalsIgnoreCase ("Log")){
          System.out.print("Enter message :");
          String message = input.nextLine();
          SystemLogger.Log(value,message);
      
             }

         }
        input.close();
    }
}
class SystemLogger{

    private static int currentLogLevel = 1;
    
    private static String getLavelName(int level){
        switch (level) {
            case 1:
                return "INFO";
            case 2:
                return "DEBUG";
            case 3:
                return "ERROR";    
            default:
                return "UNKNOWN";
        }
    }
    public static void setLogLevel(int newlevel){
        if(newlevel >=1 && newlevel <=3){
            currentLogLevel = newlevel;
            System.out.println("Log level set to " + getLavelName(newlevel));
        }
        else{
            System.out.println("Invalid log level");
        }

    }
    public static void Log(int messageLevel, String message){
                
                if(messageLevel >= currentLogLevel){
                    System.out.println("[" + getLavelName(messageLevel) + "] " + message);
                }
               
    }
}

