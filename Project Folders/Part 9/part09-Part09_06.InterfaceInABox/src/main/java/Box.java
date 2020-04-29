
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
public class Box implements Packable {
    private double cap;
    private ArrayList<Packable> packs;

    public Box(double cap) {
        this.cap=cap;
        packs = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Packable packable : packs) {
            weight+=packable.weight();
        }
        return weight;
    }
    
    public void add(Packable pack) {
        if((weight()+pack.weight())<=cap) {
            packs.add(pack);
        }
    }

    @Override
    public String toString() {
        return "Box: " + packs.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
