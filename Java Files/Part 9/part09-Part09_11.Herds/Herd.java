
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
public class Herd implements Movable {
    private ArrayList<Movable> movables;
    
    public Herd() {
        movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Movable movable : movables) {
            string.append(movable + "\n");
        }
        return string.toString();
    }
    
}
