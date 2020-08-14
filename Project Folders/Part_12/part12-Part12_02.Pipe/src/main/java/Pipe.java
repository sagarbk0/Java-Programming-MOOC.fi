
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
public class Pipe<T> {
    private ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
    
    public T takeFromPipe() {
        if(this.pipe.size()>0) {
            T takenFromPipe = this.pipe.get(0);
            this.pipe.remove(0);
            return takenFromPipe;
        }
        return null;
    }
    
    public boolean isInPipe() {
        return this.pipe.size()>0;
    }
}
