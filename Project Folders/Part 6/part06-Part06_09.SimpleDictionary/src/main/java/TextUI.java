
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
    }
    
    public void start(){
        while(true) {
            System.out.print("Command: ");
            String s = scanner.nextLine();
            if(s.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if((s.equals("add"))) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if((s.equals("search"))) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                if(dictionary.translate(word)==null) {
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
