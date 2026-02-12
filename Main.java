// a program to display the reverse of a number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number with at least 2 digits: ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) { 
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        } System.out.println("Reverse of the number is: " + reverse);
    }
}