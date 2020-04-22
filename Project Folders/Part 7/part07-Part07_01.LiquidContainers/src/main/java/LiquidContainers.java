
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first=0;
        int second=0;
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts=input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if(amount>=0 && first+amount<=100){
                    first+=amount;
                }
            }
            else if (command.equals("move")) {
                if(amount>=0 && amount<=first && second+amount<=100){
                    first-=amount;
                    second+=amount;
                }
            }
            else if (command.equals("remove")) {
                if(amount>=0 && first-amount>=0) {
                    first-=amount;
                }
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
