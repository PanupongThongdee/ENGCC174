import java.util.Scanner;
public class lab206 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter owner name :");
       String name = input.nextLine();
       System.out.print("Enter initial balance:");
       Double balance = input.nextDouble();
       System.out.print("Enter deposit amount :");
       Double deposit = input.nextDouble();

       BankAccount account = new BankAccount(name, balance );
       account.deposit(deposit);
       account.displaySummary();
       input.close();
    }
    
}
    class BankAccount {
        String ownerName ;
        double balance ;

        BankAccount(String n , double b ){
            this.ownerName = n;
            this.balance = b;
            
           
        }
        
            public void deposit(double amount){
                 balance += amount;

             
            }
            public void displaySummary(){
                System.out.println("-----Account Details-----");
                System.out.println("Owner Name :"+ ownerName);
                System.out.println("Balance :"+ balance);
        }
}

