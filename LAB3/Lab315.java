import java.util.Scanner;
public class Lab315 {
    public static void main(String[] args) {
        Scanner data11 = new Scanner(System.in);

        System.out.print("User Login System : ");
        String username15 = data11.next();
        System.out.print("Enter number of operations: ");
        int value11 = data11.nextInt();

        User15 user15 = null; 

        for (int i = 0; i < value11; i++) {
            System.out.print("Enter operation type (LOGIN/SET_POLICY): ");
            String operation11 = data11.next();

            if (operation11.equalsIgnoreCase("SET_POLICY")) {
                int max11 = data11.nextInt();
                User15.setPolicy(max11);
            } 
            else if (operation11.equalsIgnoreCase("LOGIN")) {
                if (user15 == null) {
                    user15 = new User15(username15);
                }

                System.out.print("Enter password: ");
                String password15 = data11.next();
                user15.login(password15);
            } 
            else {
                System.out.println("Invalid operation.");
            }
        }

        data11.close();
    }
}

class User15 {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User15(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max){
        if(max > 0){
            maxAttempts = max;
            System.out.println("Policy updated. Max attempts: " );
        }
        else {
            System.out.println("Invalid Policy.");
        }
    }

    public void login(String password){
        if(isLocked){
            System.out.println("Account is locked.");
            return;
        }

        if(password.equals("pass123")){
            failedAttempts = 0;
            System.out.println("Login successful.");

        } else {
            failedAttempts++;
                 if(failedAttempts >= maxAttempts){
                     isLocked = true;
                     System.out.println("Account is now locked.");
            }
            else{
                failedAttempts = maxAttempts - failedAttempts ;
                System.out.println("Login failed. Attempt " + failedAttempts +" Attempts  lift.");
            }
        }
    }
}
