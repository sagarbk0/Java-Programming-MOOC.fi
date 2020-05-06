
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        String i = "";
        
        while(true) {
            i = scanner.nextLine();
            if(Integer.parseInt(i)<0) {
                break;
            }
            nums.add(Integer.parseInt(i));
        }
        
        nums.stream()
                .filter(num -> num>=1 && num <=5)
                .forEach(num -> System.out.println(num));
    }
}
