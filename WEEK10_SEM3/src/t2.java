package week10_sem3;
class Edible{
    static class Fruit{
        static void fruitDetails(){
            System.out.println("Fruit details are...");
        }
        void fruitPackaging(){
            System.out.println("Packaging fruits...");
        }
    }
    static class Vegetable{
        static void vegetableDetails(){
            System.out.println("Vegetable details are...");
        }
        void vegetablePackaging(){
            System.out.println("Packaging vegetables...");
        }
    }
}

public class t2 {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();
        Edible.Fruit f = new Edible.Fruit();
        Edible.Vegetable v = new Edible.Vegetable();
        v.vegetablePackaging();
        v.vegetableDetails();
    }
}
