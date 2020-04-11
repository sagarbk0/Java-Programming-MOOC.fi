
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> details = new ArrayList<String>();
        String s = "0";
        while(!s.isEmpty()){
            s = scanner.nextLine();
            details.add(s);
        }
        details.remove(details.size()-1);
        double sum=0;
        int lname=0;
        String longest="0";
        for(int i=0;i<details.size();i++){
            if(details.get(i).length()>lname) {
                lname=details.get(i).length();
                longest = details.get(i).substring(0,details.get(i).length()-5);
            }
            String sub = details.get(i).substring(details.get(i).length()-4,details.get(i).length());
            sum=sum+Double.parseDouble(sub);
        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+sum/details.size());
    }
}
