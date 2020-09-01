/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class List<Type> {
    private Type[] list;
    private int endIndex;
    
    public List() {
        this.list = (Type[]) new Object[10];
        this.endIndex = 0;
    }
    
    public void add(Type value) {
        if(this.endIndex==list.length) {
            expandList();
        }
        
        this.list[this.endIndex] = value;
        this.endIndex++;
    }
    
    public int size() {
        return this.endIndex;
    }
    
    public void expandList() {
        int newSize = this.list.length + this.list.length/2;
        Type[] newList = (Type[]) new Object[newSize];
        for(int i=0; i<this.endIndex; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }
    
    public void remove(Type toRemove) {
        int j=this.endIndex;
        int endIndexOrig = this.endIndex;
        
        for(int i=0; i<endIndexOrig; i++) {
            if(this.list[i].equals(toRemove) || this.list[i]==(toRemove)) {
                j=i;
                endIndex--;
            }
            if(i>j) {
                this.list[i-1]=this.list[i];
            }
        }   
    }
    
    public boolean contains(Type toContain) {
        for(int i=0; i<this.endIndex; i++) {
            if(this.list[i].equals(toContain) || this.list[i]==(toContain)) {
                return true;
            }
        }
        
        return false;
    }
    
    public Type value(int index) {
        if(index<0 || index>=this.endIndex) {
            throw new ArrayIndexOutOfBoundsException("Index" + index + "is "
                    + "not in the array");
        }
        
        return this.list[index];
    }
    
//    This method was only supposed to be implemented as part of an alternate
//    approach to the remove() method.
//    
//    public int indexOfValue(Type toSearch) {
//        for(int i=0; i<this.endIndex; i++) {
//            if(this.list[i].equals(toSearch) || this.list[i]==(toSearch)) {
//                return i;
//            }
//        }
//        
//        return -1;
//    }
}
