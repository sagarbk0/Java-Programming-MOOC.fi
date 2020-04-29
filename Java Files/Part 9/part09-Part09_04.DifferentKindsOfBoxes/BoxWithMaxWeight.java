
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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(item.getWeight()<=capacity) {
            items.add(item);
            capacity-=item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item itemx : items) {
            if(itemx.hashCode()==item.hashCode()) {
                return true;
            }
        }
        return false;
    }
    
}
