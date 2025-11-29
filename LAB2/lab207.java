import java.util.Scanner;

public class lab207 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

       System.out.print("Enter a OwnerName : ");
       String ownerName = input.nextLine();

       System.out.print("Enter a initialBalance : ");
       double initialBalance = input.nextDouble();

       System.out.print("Enter a WithdrawAmount 1 : ");
       double withdrawAmount1 = input.nextDouble();

       System.out.print("Enter a WithdrawAmount 2 : ");
        double withdrawAmount2 = input.nextDouble();

       BankAccount1 account = new BankAccount1(ownerName, initialBalance);
       account.withdraw1(withdrawAmount1);
       account.withdraw2(withdrawAmount2);
       account.displayBalance();    
       input.close();

    }
}
 class BankAccount1 {
    String ownerName ;
    double initialBalance ;

    BankAccount1(String Name, double Balance) {
        this.ownerName = Name;
        this.initialBalance = Balance ;
    }
       public void withdraw1(double amount1 ) {
        if ( initialBalance >= amount1) {
            initialBalance -= amount1;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }

    }
   public void withdraw2(double amount2 ) {
        if ( initialBalance >= amount2) {
            initialBalance -= amount2;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }

    }
    void displayBalance() {
        System.out.println("balance: " + initialBalance);
    }
    
    
}
