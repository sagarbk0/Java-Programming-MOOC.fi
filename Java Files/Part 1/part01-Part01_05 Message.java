
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println(message);
    }
}
