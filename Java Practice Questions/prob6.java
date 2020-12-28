// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
public class prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println(a + " + "+ b+ " = " +(a + b));
        System.out.println(a + " - "+ b+ " = " + (a - b));
        System.out.println(a + " X "+ b+ " = " +a * b);
        System.out.println(a + " / "+ b+ " = " +a / b);
        System.out.println(a + " % "+ b+ " = " +a % b);
    }
}
