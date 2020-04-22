
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter point totals, -1 stops:");
        while(in!=-1){
            in=Integer.valueOf(scanner.nextLine());
            if(in>=0 && in<=100){
                numbers.add(in);
            }
        }
        int sum=0;
        int sumpass=0;
        int numpass=0;
        StringBuilder grade5 = new StringBuilder();
        StringBuilder grade4 = new StringBuilder();
        StringBuilder grade3 = new StringBuilder();
        StringBuilder grade2 = new StringBuilder();
        StringBuilder grade1 = new StringBuilder();
        StringBuilder grade0 = new StringBuilder();

        for(int i=0;i<numbers.size();i++) {
            sum+=numbers.get(i);
            if(numbers.get(i)>=50){
                sumpass+=numbers.get(i);
                numpass++;
                if(numbers.get(i)<60) {
                    grade1.append("*");
                } else if (numbers.get(i)<70) {
                    grade2.append("*");
                } else if (numbers.get(i)<80) {
                    grade3.append("*");
                } else if (numbers.get(i)<90) {
                    grade4.append("*");
                } else {
                    grade5.append("*");
                }
            } else {
                grade0.append("*");
            }
        }
        System.out.println("Point average (all): " + ((double)sum/(double)numbers.size()));
        if(sumpass>0) {
            System.out.println("Point average (passing): " + ((double)sumpass/(double)numpass));
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + 100*(double)numpass/(double)numbers.size());
        System.out.println("Grade distribution: \n5: " + grade5 + "\n4: " + grade4 + 
                "\n3: " + grade3 + "\n2: " + grade2 + "\n1: " + grade1 + 
                "\n0: " + grade0);
    }
}
