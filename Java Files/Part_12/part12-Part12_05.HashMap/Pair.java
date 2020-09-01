/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Pair<K,V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public V getValue() {
        return this.value;
    }
    
    public void setValue(V valueToSet) {
        this.value = valueToSet;
    }
    
    public K getKey() {
        return this.key;
    }
}
