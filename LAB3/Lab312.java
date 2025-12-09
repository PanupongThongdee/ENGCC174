
import java.util.Scanner;
public class Lab312 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = input1.nextLine();
        System.out.print("Enter monthly salary :");
        double salary = input1.nextDouble();
        System.out.print("Enter taxRate :");
        double taxRate = input1.nextDouble();
        System.out.print("Enter raise amount :");
        double raiseAmount = input1.nextDouble();

        Employee101 emp = new Employee101 (name, salary);
        System.out.println("Tax (before): " + emp.calculateTax(taxRate));
        emp.giveRaise(raiseAmount);
        System.out.println("Annual Salary (after): " + emp.calculateTax(taxRate ));
        input1.close();
    }
}
class Employee101{
    private String name;
    private double monthlySalary;

    public Employee101(String n, double Sal){
        this.name = n;
        if(Sal > 0){
             this.monthlySalary = Sal ;
        }
        else{
            this.monthlySalary = 0;
        }
    }
    public String getName(){
        return name;
    }
    public void giveRaise(double amonut){
        if(amonut > 0){
            this.monthlySalary += amonut;
            System.out.println("Raise applied.");
        }
        else if(amonut <= 0){
            System.out.println("Invalid amount.");

        }
    }
    private double getAnnualSalary(){
        return monthlySalary * 12;
    }
    public double calculateTax(double taxRate){
        return getAnnualSalary() * taxRate;
    }
}
