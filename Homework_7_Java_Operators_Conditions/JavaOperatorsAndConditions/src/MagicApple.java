import java.util.Scanner;

public class MagicApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current hour (0-23): ");
        int currentTime = scanner.nextInt();

        if ((currentTime >= 0) && (currentTime < 6)) {
            System.out.println("You will receive 5 units of energy from the magic apple");
        } else if ((currentTime >= 6) && (currentTime < 12)) {
            System.out.println("You will receive 10 units of energy from the magic apple");
        } else if ((currentTime >= 12) && (currentTime < 18)) {
            System.out.println("You will receive 20 units of energy from the magic apple");
        } else if ((currentTime >= 18) && (currentTime < 24)) {
            System.out.println("You will receive 30 units of energy from the magic apple");
        } else {
            System.out.println("Invalid time! Please enter a value between 0 and 23.");
        }
    }
}
