import java.util.Scanner;
public class Lab313 {
    public static void main(String[] args) {
       Scanner data9 = new Scanner (System.in);
         System.out.print("Enter number of operations:");
         int value9 = data9.nextInt();
            for(int i = 0; i < value9; i++){
                System.out.print("Enter operation type (SET_MAX/CHECKOUT/CHECKIN/STATUS):");
                String operation9 = data9.next();
                if(operation9.equalsIgnoreCase("SET")){
                    int max = data9.nextInt();
                    LicenseManager.setMax(max);
                }
                else if(operation9.equalsIgnoreCase("CHECKOUT")){
                   LicenseManager.checkOut1();
                }
                else if(operation9.equalsIgnoreCase("CHECKIN")){
                    LicenseManager.checkIn();
                }
                else if(operation9.equalsIgnoreCase("STATUS")){
                    LicenseManager.displayStatus();
                }
            }
         }
    }
    

class LicenseManager{
    private static int maxLicenses = 10 ;
    private static int usedLicenses = 0 ; 

    public static void setMax(int max){
        if(max < 0){
            System.out.println("Invalid max value.");
        }
        else if (max < usedLicenses){
            System.out.println("Cannot set max lower then current usage.");
        }
        else{
            maxLicenses = max ;
            System.out.println("Max licenses set to"+ maxLicenses);

        }
    }
    public static boolean checkOut1(){
        if(usedLicenses < maxLicenses){
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;

        }
        else {
            System.out.println("Checkout failed: No licenses available.");
            return false;

        }
    }
    public static void checkIn(){
        if(usedLicenses > 0){
            usedLicenses--;
            System.out.println("Checkin-in successful.");
        }
        else{
            System.out.println("Nothing to check-in.");
        }
    }
    public static void displayStatus(){
        System.out.println("Used :" + usedLicenses );
        System.out.println("Available :" + (maxLicenses - usedLicenses) );
    }
}
