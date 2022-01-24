import java.util.Scanner;
import java.math.*;
public class Circle {
    public Circle(double radius){                    // constructor
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :- ");
        double radius = sc.nextDouble();
        Circle C1 = new Circle(radius);
    }
}
