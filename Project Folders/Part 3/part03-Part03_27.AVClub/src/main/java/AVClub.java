
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        while(k!=0){
            String j = scanner.nextLine();
            if(j.isEmpty()){
                k=0;
            } else {
                String pieces[] = j.split(" ");
                for(int i=0;i<pieces.length;i++){
                    if(pieces[i].contains("av")){
                        System.out.println(pieces[i]);
                    }
                }
            }
        }
    }
}
