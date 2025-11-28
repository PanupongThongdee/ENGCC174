import java.util.Scanner;
public class lab205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width: ");
        double width = input.nextDouble();
        System.out.print("Enter a height: ");   
        double height = input.nextDouble();
        Rectangle data = new Rectangle(width, height);
        System.out.println("Get Area : "+ data.getArea());
        System.out.println("Get Perimeter : "+ data.getPerimeter());
        input.close();
        }

    }
     class Rectangle{

        double width;
        double height;
        public Rectangle(double w, double h){
            this.width = w;
            this.height = h;
        }
        public double getArea(){
            double area = width * height;
            return area;
        }
        public double getPerimeter(){
            double perimeter = 2 * (width + height);
            return perimeter;
        }
    }

    

       

