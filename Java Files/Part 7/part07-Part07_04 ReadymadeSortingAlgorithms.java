
import java.util.ArrayList;
import java.util.Collections;



public class Main {
    
    public static void sort(int[] array){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int element : array) {
            numbers.add(element);
        }
        Collections.sort(numbers);
        for(int i=0;i<numbers.size();i++) {
            array[i]=numbers.get(i);
        }
    }
    
    public static void sort(String[] array){
        ArrayList<String> strings = new ArrayList<>();
        for(String element : array) {
            strings.add(element);
        }
        Collections.sort(strings);
        for(int i=0;i<strings.size();i++) {
            array[i]=strings.get(i);
        }
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        // insert test code here
        int[] array = {2, 1, 3, 0};
        sort(array);
//        System.out.println();
    }

}
