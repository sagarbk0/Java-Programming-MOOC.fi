
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = "";
        ArrayList<String> input = new ArrayList<>();
        
        while(true) {
            i=scanner.nextLine();
            if(i.equals("")) {
                break;
            }
            input.add(i);
        }
        
        input.stream()
                .forEach(in -> System.out.println(in));
        
    }
}
