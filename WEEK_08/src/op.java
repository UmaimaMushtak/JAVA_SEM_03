class Car{
    String model;
    String color;
    int price;

    Car(){
        this("Unknown","Not specified");
        this.price = 0;
    }
    Car(String model){
        this(model, "Not specified");
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
        this.price = 0;
    }

    public void setDetails(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
        System.out.println("-----------------------------");
    }
}
public class op {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setDetails("Swift", "White", 500000);
        car1.display();

        Car car2 = new Car("Innova");
        car2.setDetails("Innova", "Black", 1500000);
        car2.display();

        Car car3 = new Car("Creta", "Red");
        car3.setDetails("Creta", "Red", 1200000);
        car3.display();
    }
}
