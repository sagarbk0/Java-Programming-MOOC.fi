
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        File recipes = new File(file);
        scanner = new Scanner(recipes);
        ArrayList<String> recipelist = new ArrayList<String>();
        StringBuilder data = new StringBuilder();
        Scanner scanner2 = new Scanner(recipes);
        while(scanner.hasNextLine()) {
            data.append(scanner.nextLine()+"\n");
            if(scanner2.nextLine().equals("")){
                recipelist.add(data.toString());
                data.delete(0,data.length());
            }
        }
        recipelist.add(data.toString());
        data.delete(0,data.length());
        
        System.out.println("\nCommands: \nlist - list the recipes\nstop - "
                + "stops the program\nfind name - searches recipes by name" +
                "\nfind cooking time - searches recipes by cooking time" + 
                "\nfind ingredient - searches recipes by ingredient");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter command: ");
        String value = scanner3.nextLine();
        do {
            if(value.equals("list")) {
                for(int i=0;i<recipelist.size();i++) {
                    scanner = new Scanner(recipelist.get(i));
                    System.out.println(scanner.nextLine() + ", cooking time: " + 
                            scanner.nextLine());
                }
                System.out.println();
            }
            
            if(value.equals("stop")) {
                break;
            }
            
            if(value.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner3.nextLine();
                System.out.println("\nRecipes:");
                for(int i=0;i<recipelist.size();i++) {
                    scanner = new Scanner(recipelist.get(i));
                    String find = scanner.nextLine();
                    if(find.contains(word)) {
                        System.out.println(find + ", cooking time: " + 
                            scanner.nextLine());
                    }
                }
                System.out.println();
            }
            
            if(value.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int mtime = Integer.valueOf(scanner3.nextLine());
                for(int i=0;i<recipelist.size();i++) {
                    scanner = new Scanner(recipelist.get(i));
                    String find = scanner.nextLine();
                    int time = Integer.valueOf(scanner.nextLine());
                    if(time<=mtime) {
                        System.out.println(find + ", cooking time: " + 
                            time);
                    }
                }
                System.out.println();
            }
            
            if(value.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ing = scanner3.nextLine();
                for(int i=0;i<recipelist.size();i++) {
                    scanner = new Scanner(recipelist.get(i));
                    String find = scanner.nextLine();
                    int time = Integer.valueOf(scanner.nextLine());
                    ArrayList<String> ings = new ArrayList<String>();
                    while(scanner.hasNextLine()){
                        ings.add(scanner.nextLine());
                    }
                    if(ings.contains(ing)) {
                        System.out.println(find + ", cooking time: " + 
                            time);
                    }
                }
                System.out.println();
            }
            
            System.out.print("Enter command: ");
            value = scanner3.nextLine();
        } while (scanner3.hasNext());
        
    }

}
