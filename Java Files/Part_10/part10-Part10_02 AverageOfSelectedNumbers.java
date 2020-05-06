
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        String select;
        
        while(true) {
            String s = scanner.nextLine();
            if(s.equals("end")) {
                System.out.println("Print the average of the negative numbers "
                        + "or the positive numbers? (n/p)");
                select = scanner.nextLine();
                break;
            }
            inputs.add(s);
        }
        
        double average;
        if(select.equals("n")) {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number<0)
                    .average()
                    .getAsDouble();
        } else {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number>=0)
                    .average()
                    .getAsDouble();
        }
        
        System.out.println("average of the numbers: " + average);

    }
}
