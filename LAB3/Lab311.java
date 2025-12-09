import java.util.Scanner;
public class Lab311 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number of operations:");
       int n = input.nextInt();

       for(int i = 0 ; i < n ; i++){
            System.out.print("Enter operation type (SET_URL/SET_MAX):");
            String operation = input.next();
            SystemConfig config = SystemConfig.getInstance();
            if(operation.equalsIgnoreCase("SET_URL")){
                System.out.print("Enter server URL:");
                String url = input.next();
                config.setServerUrl(url);
            }
            else if(operation.equalsIgnoreCase("SET_MAX")){
                System.out.print("Enter max connections:");
                int maxConn = input.nextInt();
                config.setMaxConnections(maxConn);
            }
            else if(operation.equalsIgnoreCase("SHOW")){
                System.out.println("Server URL: " + config.getServerUrl());
                System.out.println("Max Connections: " + config.getMaxConnections());

            }

       }
         input.close();
    }
}
class SystemConfig{
    private static SystemConfig instance ;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig(){
        serverUrl = "default.server.com";
        maxConnections = 10;
    }
    public static SystemConfig getInstance(){
        if(instance == null){
            instance = new SystemConfig();
        }
        return instance;
    }
    public String getServerUrl(){
        return serverUrl;
    }
    public void setServerUrl(String url){
        serverUrl = url;
    }
    public int getMaxConnections(){
        return maxConnections;
    }
    public void setMaxConnections(int count){
        if(count > 0){
            maxConnections = count;
            System.out.println("Max connections set." );
        }
        else if(count <= 0){
            System.out.println("Invalid count.");

        }
    }
}