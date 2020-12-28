//9. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
import java.util.Scanner;
public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int avg = (a + b +c)/3;
        System.out.println("The Average of three numbers is: " + avg);
    }
}
