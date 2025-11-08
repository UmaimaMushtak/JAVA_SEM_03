package week10_sem3;
class Person{
    String name;
    int phoneno;
    Address address;
    DateOfBirth dob;

    class Address{
        int House_no;
        String Street;
        String City;
        String State;

        void displayAddr(){
            System.out.println("Address: " + House_no + "," + Street + "," + City + "," + State);
        }
    }

    class DateOfBirth{
        int Day;
        String Month;
        int Year;

        void displayDOB(){
            System.out.println("DOB: " + Day + "," + Month + "," +Year);
        }
    }
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("Phoneno: " + phoneno);
        if(address!= null){
            address.displayAddr();
        }
        if(dob!=null){
            dob.displayDOB();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sarah";
        p.phoneno = 38950;
        p.address = p.new Address();
        p.address.House_no = 10;
        p.address.Street = "Medical road";
        p.address.City = "Aligarh";
        p.address.State = "UP";
        p.dob = p.new DateOfBirth();
        p.dob.Day = 14;
        p.dob.Month ="Feb";
        p.dob.Year = 2005;

        p.Display();
    }
}