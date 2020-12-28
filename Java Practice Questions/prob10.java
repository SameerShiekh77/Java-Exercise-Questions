// 10. Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;
public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of the rectangle");
        float w = sc.nextFloat();
        System.out.println("Enter height of the rectangle");
        float h = sc.nextFloat();
        System.out.println("The area of rectangle is: " + w *h);
        System.out.println("The perimeter of rectangle is: " + 2 *(w + h));
    }
}
