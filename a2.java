import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User please Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter you Lucky Number: ");
        int lucky = sc.nextInt();
        System.out.println("Hello " + name + " your Lucky Number " + lucky + " shows you are really hardworking. Keep it up!");
    }
}