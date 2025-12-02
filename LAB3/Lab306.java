package ENGCC174.LAB3;
import java.util.Scanner;
public class Lab306 {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance : ");
        Double balance = input.nextDouble();

        System.out.print("Enter deposit : ");
        Double deposit = input.nextDouble();

        System.out.print("Enter withdraw : ");
        Double withdraw = input.nextDouble();

        BankAccount data2 = new BankAccount(balance);
        data2.deposit(deposit);
        data2.withdraw(withdraw);
        System.out.println(data2.getBalance());

        input.close();
    }
}

class BankAccount{
    private double balance ;

    public BankAccount(double initialbalance){
        if(initialbalance >= 0){
            this.balance = initialbalance ;
        }
        else {
            this.balance = 0 ;
        }
    }
    public double getBalance(){
        return balance ;
    }
    public void deposit(double amount){
        if(amount > 0){
             balance += amount ;
            System.out.println("Deposit successful.");
        }
        else if (amount <= 0 ){
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance-= amount ;
            System.out.println("Withdrawal successful.");
        }
        else if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else if(amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        }

    }

}
