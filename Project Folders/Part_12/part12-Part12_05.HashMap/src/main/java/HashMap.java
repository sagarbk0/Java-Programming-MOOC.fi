
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
public class HashMap<K,V> {
    private ArrayList<Pair<K,V>>[] hashMap;
    private int hashNumber;
    
    public HashMap() {
        this.hashMap = new ArrayList[32];
        this.hashNumber=32;
    }
    
    public void add(K key, V value) {
        int hashF = hashFunction(key);
        
        if(hashMap[hashF]==null) {
            hashMap[hashF]=new ArrayList<Pair<K,V>>();
        }
        
        if(hashMap[hashF].size()==100) {
            this.doubleHashMap();
        }
        
        hashMap[hashF].add(new Pair(key, value));
    }
    
    public void removeFromKey(K key) {
        int hashF = hashFunction(key);
        
        for(Pair pair : hashMap[hashF]) {
            if(pair.getKey().equals(key)) {
                hashMap[hashF].remove(pair);
            }
        }
    }
    
    public V getValue(K key) {
        int hashF = hashFunction(key);
        
        for(Pair pair : hashMap[hashF]) {
            if(pair.getKey().equals(key)) {
                return (V)pair.getValue();
            }
        }
        
        return null;
    }
    
    private void doubleHashMap() {
        ArrayList<Pair<K,V>>[] oldHashMap = this.hashMap;
        
        this.hashMap = new ArrayList[this.hashNumber*2];
        this.hashNumber*=2;
        
        for(ArrayList<Pair<K,V>> list : oldHashMap) {
            for(Pair<K,V> pair : list) {
                this.add(pair.getKey(), pair.getValue());
            }
        }
    }
    
    public int hashFunction (K key) {
        return Math.abs(key.hashCode()%this.hashNumber);
    }
}
