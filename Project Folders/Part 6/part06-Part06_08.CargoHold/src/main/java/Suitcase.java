
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
public class Suitcase {
    private ArrayList<Item> items = null;
    private int maxWeight;
    private int currWeight;
    
    public Suitcase(int weight){
        this.currWeight=0;
        this.maxWeight=weight;
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        if(this.currWeight+item.getWeight()<=this.maxWeight){
            this.currWeight+=item.getWeight();
            this.items.add(item);
        }
    }
    
    public void printItems(){
//        StringBuilder allItems = new StringBuilder("");
        for(int i=0;i<this.items.size();i++){
            System.out.println(this.items.get(i));
        }
//        return allItems.toString();
    }
    
    public int totalWeight(){
        return this.currWeight;
    }
    
    public Item heaviestItem(){
        int max=0;
        Item Max=null;
        for(int i=0;i<this.items.size();i++){
            if(this.items.get(i).getWeight()>max){
                max=this.items.get(i).getWeight();
                Max=this.items.get(i);
            }
        }
        return Max;
        
    }

    @Override
    public String toString() {
        StringBuilder returnVal = new StringBuilder("");
        if (this.items.size()==0) {
            returnVal.append("no items (0 kg)");
        } else if (this.items.size()==1) {
            returnVal.append("1 item (" + this.currWeight + " kg)");
            
        } else {
            returnVal.append(this.items.size() + " items (" + this.currWeight + " kg)");
        }
        return returnVal.toString();
    }    
    
}
