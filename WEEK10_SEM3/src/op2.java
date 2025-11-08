package week10_sem3;
class Shape{
    void area(int side){
        System.out.println("Area of Square: " + side*side);
    }
    void area(int length, int breadth){
        System.out.println("Area of Rectangle: " + length*breadth);
    }
    void area(double radius){
        System.out.println("Area of Circle: " + Math.PI*radius*radius);
    }
}
public class op2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(2);
        s.area(12,4);
        s.area(2.5);
    }
}
