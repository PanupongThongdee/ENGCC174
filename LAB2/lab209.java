import java.util.Scanner;

public class lab209 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter Street : ");
        String street = input.nextLine();
        System.out.print("Enter City : ");
        String city = input.nextLine();
        System.out.print("Enter zip code : ");
        String zip = input.nextLine();

        Address address = new Address(street, city, zip);
        student student1 = new student(name, address);
        student1.displayProfile();
        input.close();
    }
}
class Address{
     String street;
     String city;
     String zip;

     Address( String street, String city, String zip){
        
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String getFullAddress(){
        return street + ", " + city + ", " + zip;
    }
}
class student{
    String name ;
    Address address;
    student(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public void displayProfile(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}