import java.util.Scanner;
public class lab208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a mode C_TO_F or F_TO_C : ");
        String mode = input.nextLine();
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        if(mode.equals("C_TO_F")){
            double value1 = TempConverter.celsiusToFahrenheit(temperature);
            System.out.println("C_TO_F : "+value1);
        }
        else if(mode.equals("F_TO_C")){
            double value2 = TempConverter.fahrenheitToCelsius(temperature);
            System.out.println("F_TO_C : "+value2);
        }
        else{
            System.out.println("Invalid mode");
        }

       
        input.close();
}
}
class TempConverter{
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}