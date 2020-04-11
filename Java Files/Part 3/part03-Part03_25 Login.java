
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String u = scanner.nextLine();
        System.out.print("Enter password: ");
        String p = scanner.nextLine();
        if(u.equals("alex")&&p.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (u.equals("emma")&&p.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
