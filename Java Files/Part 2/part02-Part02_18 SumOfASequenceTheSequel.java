
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Last number? ");
        int b = Integer.parseInt(scanner.nextLine());
        
        int sum=0;
        
        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        
        System.out.print("The sum is " + sum);
    }
}
