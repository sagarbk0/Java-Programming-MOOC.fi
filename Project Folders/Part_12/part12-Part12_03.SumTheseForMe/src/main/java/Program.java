
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
    
    public static int sum(int[] array, int fromWhere, 
            int toWhere, int smallest, int largest) {
        int ans = 0;
        for(int i=Math.max(fromWhere, 0); i<Math.min(array.length, toWhere+1); i++) {
            if(array[i]>=smallest && array[i]<=largest) {
                ans+=array[i];
            }
        }
        return ans;
    }
}
