
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int s = Integer.parseInt(scanner.nextLine());
        
        int fact = 1;
        
        for(int i=s;i>0;i--){
            fact = fact*i;
        }
        
        System.out.print("Factorial: " + fact);
    }
}
