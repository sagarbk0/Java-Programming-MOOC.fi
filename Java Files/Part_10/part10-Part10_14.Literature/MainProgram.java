
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sagar Bhatt
 */
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in="in", in2="in2";
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            in=scanner.nextLine();
            if(in.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            in2=scanner.nextLine();
            if(in2.equals("")) {
                break;
            }
            
            books.add(new Book(in,Integer.parseInt(in2)));
            System.out.println("");
        }
        
        System.out.println("\n" + books.size() + " books in total.\n");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);

        System.out.println("Books:");
        for(Book book : books) {
            System.out.println(book.getName() + " (recommended for " +
                    book.getAge() + " year-olds or older)");
        }
    }

}
