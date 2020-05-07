
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((row1, row2) -> {
                            return row1[5].compareTo(row2[5]);})
                    .map(row -> row[3] + " (" + row[4] + ")," + row[2].substring(0,
                            row[2].length()-4) + ", " + row[5])
                    .forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
