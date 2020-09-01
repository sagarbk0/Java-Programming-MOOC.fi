
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<String> myList = new List<>();
        for (int i = 0; i < 11; i++) {
            myList.add(i+"");
        }
        System.out.println(myList.contains("10"));
        myList.remove("9");
        System.out.println(myList.contains("hello"));
        System.out.println(myList.value(9));
//        System.out.println(myList.indexOfValue("9"));
    }

}
