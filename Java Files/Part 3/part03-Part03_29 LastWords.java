
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i!=1){
            String g = scanner.nextLine();
            if(g.isEmpty()){
                i=1;
            } else {
                String[] parts = g.split(" ");
                System.out.println(parts[parts.length-1]);
            }
        }
        
    }
}
