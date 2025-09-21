class FRUIT4{
    String color;
    String taste;
    int price;

    FRUIT4(String color, String taste, int price){
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    FRUIT4(String color, String taste){
        this.color = color;
        this.taste = taste;
        this.price = 100;
    }
    FRUIT4(String color){
        this.color = color;
        this.taste = "sweet";
        this.price = 100;
    }
    void display() {
        System.out.println("Color is : " + color);
        System.out.println("Taste is : " + taste);
        System.out.println("Price is : " + price);
    }
}
public class t4 {
    public static void main(String[] args) {
        FRUIT4 strawberry = new FRUIT4("Red", "Sour");
        FRUIT4 mulberry = new FRUIT4("Purple");
        mulberry.display();
        strawberry.display();
    }
}
