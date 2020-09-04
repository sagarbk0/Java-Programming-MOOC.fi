
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        
        Random random = new Random();
        
        while(this.numbers.size()!=7) {
            int j = random.nextInt(40)+1;
            if(this.numbers.contains(j)) {
                continue;
            } else {
                this.numbers.add(j);
            }
        }
        
        Collections.sort(this.numbers);
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    //Unneeded method, part of exercise
    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(this.numbers.contains(number)) {
            return true;
        }
        
        return false;
    }
}

