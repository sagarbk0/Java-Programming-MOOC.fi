
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> birds = new ArrayList<String>();
        ArrayList<Integer> birdsCount = new ArrayList<Integer>();
        StringBuilder s = new StringBuilder();
        
        System.out.print("? ");
        String in = scan.nextLine();
        
        while(true) {
            if(in.equals("Add")) {
                System.out.print("Name: ");
                s.append(scan.nextLine());
                System.out.print("Name in Latin: ");
                s.append(" (" + scan.nextLine() + ")");
                birds.add(s.toString());
                birdsCount.add(0);
                s.delete(0, s.length());
            }
            if(in.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                int find=0;
                for(int i=0;i<birds.size();i++){
                    if((birds.get(i)).contains(bird)) {
                        birdsCount.set(i, birdsCount.get(i)+1);
                        find++;
                    }
                }
                if(find==0) {
                    System.out.println("Not a bird!");
                }
            }
            if(in.equals("All")) {
                for(int i=0;i<birds.size();i++){
                    System.out.println(birds.get(i) + ": " + birdsCount.get(i) + 
                            " observations");
                }
            }
            if(in.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                int find=0;
                for(int i=0;i<birds.size();i++){
                    if((birds.get(i)).contains(bird)) {
                        System.out.println(birds.get(i) + ": " + birdsCount.get(i) + 
                            " observations");
                    }
                }
            }
            if(in.equals("Quit")) {
                break;
            }
            System.out.print("? ");
            in = scan.nextLine();
        }
    }

}
