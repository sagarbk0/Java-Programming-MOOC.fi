
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner namefile = new Scanner(Paths.get(file))){
            while (namefile.hasNextLine()) {
                String record = namefile.nextLine();
                if(record.charAt(record.length()-2)==','){
                    System.out.print(record.substring(0, record.length()-2));
                    System.out.print(", age: " + record.charAt(record.length()-1));
                    if(record.charAt(record.length()-1)==1) {
                        System.out.print(" year\n");
                    } else {
                        System.out.print(" years\n");
                    }
                } else {
                    System.out.print(record.substring(0, record.length()-3));
                    System.out.print(", age: " + record.substring(record.length()-2, record.length()) +
                            " years\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }
    }
}
