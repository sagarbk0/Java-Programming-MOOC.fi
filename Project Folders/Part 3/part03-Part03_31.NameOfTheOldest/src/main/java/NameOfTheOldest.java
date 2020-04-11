
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> details = new ArrayList<String>();
        String s = "0";
        while(!s.isEmpty()){
            s = scanner.nextLine();
            details.add(s);
        }
        details.remove(details.size()-1);
        int oldest=0;
        String oldperson="0";
        for(int i=0;i<details.size();i++){
            if(details.get(i).charAt(details.get(i).length()-2)==','){
                if(Integer.parseInt(details.get(i).substring(details.get(i).length()-1))>oldest) {
                    oldest=Integer.parseInt(details.get(i).substring(details.get(i).length()-1));
                    oldperson = details.get(i).substring(0,details.get(i).length()-2);
                }
            } else {
                if(Integer.parseInt(details.get(i).substring(details.get(i).length()-2,details.get(i).length()))>oldest) {
                    oldest=Integer.parseInt(details.get(i).substring(details.get(i).length()-2,details.get(i).length()));
                    oldperson = details.get(i).substring(0,details.get(i).length()-3);
                }
            }
        }
        System.out.println("Name of the oldest: "+oldperson);
    }
}
