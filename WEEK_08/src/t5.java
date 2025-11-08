class FRUIT5{
    String color;
    String taste;
    int price;

    FRUIT5(){
        this("Unknown" ,"Unknown" ,0);
    }

    FRUIT5(String color, String taste){
        this(color, taste, 0);
    }

    FRUIT5(String color, String taste, int price){
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
public class t5 {
    public static void main(String[] args) {
        FRUIT5 f1 = new FRUIT5();
        FRUIT5 f2 = new FRUIT5("green","sour");
        FRUIT5 f3 = new FRUIT5("yellow", "sweet", 20);
        f1.display();
        f2.display();
        f3.display();
    }
}
