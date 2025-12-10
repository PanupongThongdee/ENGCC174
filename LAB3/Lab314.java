import java.util.Scanner;
public class Lab314 {

    public static void main(String[] args) {
        Scanner data10 = new Scanner (System.in);
        System.out.print("Enter number of operations:");
        int value10 = data10.nextInt();

         Bankaccount10 myAccount10 = null; 
         
        for(int i = 0; i < value10; i++){
            System.out.print("Enter operation type (CREATE/DEPOSIT/WITHDRAW/STATUS/GLOBAL_STATUS):");
            String operation10 = data10.next();

            if(operation10.equalsIgnoreCase("CREATE")){
                double initial10 = data10.nextDouble();
                myAccount10 = new Bankaccount10(initial10);
            }
           else if(operation10.equalsIgnoreCase("DEPOSIT" )|| operation10.equalsIgnoreCase("WITHDRAW")){
                System.out.print("Enter amount:");
                double amount10 = data10.nextDouble();

                if(myAccount10 == null){
                    System.out.println("No account exists.");
                }
                else{
                  
                    if(operation10.equalsIgnoreCase("DEPOSIT")){
                        myAccount10.deposit(amount10);
                    }
                    else if(operation10.equalsIgnoreCase("WITHDRAW")){
                        myAccount10.withdraw(amount10);
                    }

                }
           }
           else if(operation10.equalsIgnoreCase("STATUS")){
                    if(myAccount10 == null){
                        System.out.println("No account exists.");                    
                    }
                    else{
                        System.out.println("Balance: " + myAccount10.getBalance());
                    }
           }
    
            else if(operation10.equalsIgnoreCase("GLOBAL_STATUS")){
                System.out.println("Total transactions: " + Bankaccount10.getTotalTransactionCount());
            }
        }
         data10.close();    
        }
        
    }
class Bankaccount10{
    private double balance;
    private static int totalTransactionCount = 0;

    public Bankaccount10(Double initialDeposit){
        if(initialDeposit >= 0){
            this.balance = initialDeposit;
            System.out.println("Account created");
        }
        else{
            this.balance = 0;
        }

    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        }
        else{
            System.out.println("Invalid amount.");

        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
        else if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            System.out.println("Invalid amount.");

        }
    }
    public double getBalance(){
        return balance;
    }
    public static int getTotalTransactionCount(){
        return totalTransactionCount;
    }
}