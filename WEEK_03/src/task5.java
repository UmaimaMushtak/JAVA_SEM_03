import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of point1:");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Coordinates of point1 are "+ x1+","+x2);
        System.out.println("Enter the coordinates of point2:");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Coordinates of point2 are "+ y1+","+y2);
        double dx = Math.pow((x2-x1),2);
        double dy = Math.pow((y2-y1),2);
        double sum = dx+dy;
        double distance = Math.sqrt(sum);
        System.out.println("distance = " + distance);

    }
}
