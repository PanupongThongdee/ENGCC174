import java.util.Scanner;



public class lab204 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = input.nextLine();
        System.out.print("Enter your midTermScore :");
        int point = input.nextInt();
        System.out.print("Final Grade :");
        int grade = input.nextInt();

        Student data = new Student(name, point, grade);
        data.display();
    
        input.close();

      
        
    }
}

class Student {
        String name;
        int point;
        int grade;

        public Student(String n, int p, int g) {
            this.name = n;
            this.point = p;
            this.grade = g;
        }
        public double calculateAverage(int point , int grade){
                double average = (point + grade) / 2.0;
                return average;
            }
        public void display (){
            System.out.println("name :" + name);
            System.out.println("midTermScore :" + calculateAverage(point, grade));
            if(calculateAverage(point, grade) >= 50){
                System.out.println("Status: Pass");
            }
            else{
                System.out.println("Status: Fail");
            }


        }
          
    }
