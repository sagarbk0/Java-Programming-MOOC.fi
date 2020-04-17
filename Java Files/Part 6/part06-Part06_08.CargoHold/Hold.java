
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxHold;
    private int currHold;
    
    public Hold(int max){
        this.maxHold=max;
        this.currHold=0;
        suitcases=new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((suitcase.totalWeight()+currHold)<=this.maxHold){
            this.suitcases.add(suitcase);
            currHold+=suitcase.totalWeight();
        }
    }
    
    public void printItems(){
        for(int i=0;i<this.suitcases.size();i++){
            this.suitcases.get(i).printItems();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(suitcases.size()+" suitcases (");
        sb.append(currHold+" kg)");
        return sb.toString();
    }
    
    
}
