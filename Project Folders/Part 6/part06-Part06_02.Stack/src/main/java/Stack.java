
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
public class Stack {
    private ArrayList<String> stack = null;
    
    public Stack(){
        stack = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public String take(){
        String s = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return s;
    }
    
    public ArrayList<String> values(){
//        for(int i=0;i<stack.size();i++) {
//            System.out.println(stack.get(i));
//        }
        return stack;
    }
}
