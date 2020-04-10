
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int j = Integer.parseInt(scanner.nextLine());
        
        System.out.println(i+" + "+j+" = "+(i+j));
        System.out.println(i+" - "+j+" = "+(i-j));
        System.out.println(i+" * "+j+" = "+(i*j));
        System.out.println(i+" / "+j+" = "+((double)i/(double)j));

    }
}
