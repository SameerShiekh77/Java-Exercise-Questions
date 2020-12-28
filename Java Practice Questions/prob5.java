//5. Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;
public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println(a + " X "+ b+ " = " +a * b);
    }
}
