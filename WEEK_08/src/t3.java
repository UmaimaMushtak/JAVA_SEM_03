class FRUIT3{
    String color;
    String taste;
    int price;

    FRUIT3(String color, String taste, int price){
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    void display() {
        System.out.println("Color is : " + color);
        System.out.println("Taste is : " + taste);
        System.out.println("Price is : " + price);
    }
}

public class t3 {
    public static void main(String[] args) {
        FRUIT3 banana = new FRUIT3("yellow", "sweet", 30);
        banana.display();
    }
}
