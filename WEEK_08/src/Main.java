class FRUIT{
    String color;
    String taste;
    int price;

    void display(){
        System.out.println("Color is : "+color);
        System.out.println("Taste is : "+taste);
        System.out.println("Price is : "+price);
    }
}
public class Main {
    public static void main(String[] args) {
    FRUIT orange = new FRUIT();
    orange.color = "Orange";
    orange.taste = "Sour";
    orange.price = 10;
    orange.display();

    FRUIT apple = new FRUIT();
    apple.color = "Red";
    apple.taste = "Sweet";
    apple.price = 150;
    apple.display();

    FRUIT kiwi = new FRUIT();
    kiwi.color = "Brown";
    kiwi.taste = "Sour";
    kiwi.price = 80;
    kiwi.display();
    }
}