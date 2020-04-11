
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        ArrayList<Integer> i = new ArrayList<Integer>();
        int in=0;
        while(true){
            in = Integer.parseInt(scanner.nextLine());
            if(in!=-1) {
                i.add(in);
            } else {
                break;
            }
        }
        
        System.out.println("Thx! Bye!");
        int sum = 0;
        int even = 0;
        int odd = 0;
        for(int s : i){
            sum += s;
            if(s%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + i.size());
        System.out.println("Average: " + (double)sum/(double)i.size());
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
