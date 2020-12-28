// Write a Java program to print the area and perimeter of a circle
import java.util.Scanner;
public class prob8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pie = 3.142f;
        System.out.println("Enter radius value of circle");
        float rad = sc.nextFloat();
        System.out.println("The Area of a circle is: " + pie * Math.pow(rad,2));
        System.out.println("The Perimeter of a circle is: " + 2 * pie * rad);

    }
}