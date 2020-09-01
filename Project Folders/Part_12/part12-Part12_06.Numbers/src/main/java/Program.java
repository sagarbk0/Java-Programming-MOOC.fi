
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        
        int g = Integer.parseInt(scanner.nextLine());
        
        Random randomInt = new Random();
        
        for(int i=0; i<g; i++) {
            int randomInt0to10 = randomInt.nextInt(11);
            System.out.println(randomInt0to10);
        }
    }

}
