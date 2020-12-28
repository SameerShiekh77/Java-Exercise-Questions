// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;
public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        for(int i = 1;i <=10;i++)
        {
            System.out.printf("%d X %d = %d\n" , num,i,num*i);
        }
    }
}
