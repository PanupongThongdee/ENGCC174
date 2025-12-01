import java.util.Scanner;
public class lab211 {
    public static void main(String[] nigga) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Model Car: ");
        String model = input.nextLine();
        System.out.print("Enter Year Car: ");
        int Year1 = input.nextInt();
         System.out.print("Enter update Year Car: ");
        int Year2 = input.nextInt();

        Car car = new Car(model, Year1);
        car.setyear(Year2);
        System.out.println("Model : "+"["+car.getModel()+"]");
        System.out.println("Year : "+"["+car.getYear()+"]");

    }
}
class Car {
    String model ;
    int year ;

    Car (String model, int year){
        this.model = model ;
        this.year = year ;
        
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setyear(int newyear){
        this.year = newyear;
    }
}
   
