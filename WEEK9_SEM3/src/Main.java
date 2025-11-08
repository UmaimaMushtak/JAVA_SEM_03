class Vehicle{
    void cost(int cost){
        System.out.println("Cost of the vehicle is = "+ cost);
    }
}
class Bus extends Vehicle{
    int capacity;
    void display(){
        System.out.println("capacity = " + capacity);
    }
}
class Train extends Vehicle{
    int speed;
    void display(){
        System.out.println("speed = " + speed);
    }
}
public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.capacity = 20;
        b1.cost(100);
        b1.display();
        Train t1 = new Train();
        t1.speed = 100;
        t1.cost(200);
        t1.display();
    }
}