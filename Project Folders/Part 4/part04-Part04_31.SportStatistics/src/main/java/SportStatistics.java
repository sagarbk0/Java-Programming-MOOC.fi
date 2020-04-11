
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<Team>();
        System.out.println("Name of the file:");
        String file = scan.nextLine();
        try(Scanner namefile = new Scanner(Paths.get(file))){
            while (namefile.hasNextLine()) {
                String[] r = namefile.nextLine().split(",");
                int t1=-1, t2=-1, win1=0, win2=0;
                
                if(Integer.parseInt(r[2])>Integer.parseInt(r[3])) {
                    win1 = 1;
                } else {
                    win2 = 1;
                }
                
                for(int i=0;i<teams.size();i++){
                    if(teams.get(i).getName().equals(r[0])) {
                        t1 = 1;
                        teams.get(i).setGames(teams.get(i).getGames()+1);
                        teams.get(i).setWins(teams.get(i).getWins()+win1);
                    }
                    if(teams.get(i).getName().equals(r[1])) {
                        t2 = 1;
                        teams.get(i).setGames(teams.get(i).getGames()+1);
                        teams.get(i).setWins(teams.get(i).getWins()+win2);
                    }
                }
                
                if(t1==-1) {
                    teams.add(new Team(r[0],1,win1));
                }
                
                if(t2==-1) {
                    teams.add(new Team(r[1],1,win2));
                }
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }
        
        System.out.println("Team:");
        String tname = scan.nextLine();
        int foundt = 0;
        for(int i=0;i<teams.size();i++){
            if(teams.get(i).getName().equals(tname)) {
                System.out.println(teams.get(i));
                foundt = 1;
            }
        }
        if(foundt==0) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

}
