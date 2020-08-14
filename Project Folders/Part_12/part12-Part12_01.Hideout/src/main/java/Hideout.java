
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
public class Hideout<T> {
    private T hideout = null;
    
    public void putIntoHideout(T toHide) {
        hideout=toHide;
    }
    
    public T takeFromHideout() {
        T t = hideout;
        hideout=null;
        return t;
    }
    
    public boolean isInHideout() {
        return hideout!=null;
    }
}
