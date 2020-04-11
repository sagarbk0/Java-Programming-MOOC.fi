
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = 1;
        int c = 0;
        while(in!=0){
            System.out.println("Give a number:");
            in = Integer.parseInt(scanner.nextLine());
            if(in<0){
                c=c+1;
            }
        }
        System.out.println("Number of negative numbers: "+c);
    }
}
