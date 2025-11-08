package week10_sem3;
class Vehicle{
    void run(){
        System.out.println("Running..");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike running..");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("Car running...");
    }
}
public class op3 {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        b.run();
        Vehicle c = new Car();
        c.run();
    }
}
