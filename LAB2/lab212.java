import java.util.Scanner;
public class lab212 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter courseseld : ");
       String code = input.nextLine();
       System.out.print("Enter courseName : ");
       String courseName = input.nextLine();
       System.out.print("Enter name ");
       String name = input.nextLine();
       Course course = new Course(code, courseName);
       student3 dataStudent = new student3(name, course);
       System.out.println(dataStudent.getStudentInfo());
    }
}

class Course{
    String courseseld ;
    String courseName ;

    public Course(String courseseld, String courseName){
        this.courseseld = courseseld ;
        this.courseName = courseName ;

    }
    String getCourseInfo(){
        return courseseld + " : " + courseName ;
    }

}

class student3
{
    String studentName;
    Course enrolledCourse;

    public student3(String studentName, Course enrolledCourse){
        this.studentName = studentName ;
        this.enrolledCourse = enrolledCourse ;

    }
    String getStudentInfo(){
        System.out.println("----- Student Information -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Course: " + enrolledCourse.getCourseInfo());
        return "";
       
    }
}
