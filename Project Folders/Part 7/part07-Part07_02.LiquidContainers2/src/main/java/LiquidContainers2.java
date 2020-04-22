
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            String[] parts=input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                first.add(amount);
            }
            else if (command.equals("move")) {
                if(amount<=first.contains()){
                    first.remove(amount);
                    first.add(amount);
                }
            }
            else if (command.equals("remove")) {
                first.remove(amount);
            }
            else if (input.equals("quit")) {
                break;
            }
            else {
                System.out.println("Invalid entry");
            }

        }
    }

}
