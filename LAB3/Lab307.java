package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab307 {
    public static void main(String[] gay){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Empolyee ID : ");
        String code = input.nextLine();
        System.out.print("Enter department : ");
        String data = input.nextLine();
        System.out.print("Enter New department : ");
        String newData = input.nextLine();
        Employee Employee = new Employee(code , data);
        Employee.setDepartment(newData);

        System.out.println(Employee.getEmpolyeeID());
         System.out.println(Employee.getDepartment());
        input.close();

    }
}
class Employee{
    private String empolyee ;
    private String department ;

    Employee (String id , String department){
        this.empolyee = id;
        this.department = department ;
    }
    public String getEmpolyeeID(){
        return empolyee ;
    }
    public String getDepartment(){
        return department ;
    }
    public void setDepartment(String newDepartment){
        this.department = newDepartment ;
    }
}
