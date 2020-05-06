
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream().filter(x -> x > 0).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

}
