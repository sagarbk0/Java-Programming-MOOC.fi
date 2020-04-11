
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int found = 0;
        
        try(Scanner namefile = new Scanner(Paths.get(file))){
            while (namefile.hasNextLine()) {
                if(searchedFor.equals(namefile.nextLine())){
                    found = 1;
                    System.out.println("Found!");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }
        
        if(found==0) {
            System.out.println("Not found.");
        }
    }
}
