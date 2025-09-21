class FRUIT1 {
    String color;
    String taste;
    int price;

    void setdetails(String color, String taste, int price) {
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
    public class t2 {
        public static void main(String[] args){
            FRUIT1 apple = new FRUIT1();
            apple.setdetails("Red","Sweet",120);
            apple.display();
        }
}
