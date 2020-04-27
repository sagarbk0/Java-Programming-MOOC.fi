
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage = null;

    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if(storage.containsKey(unit)) {
            storage.get(unit).add(item);
        } else {
            storage.put(unit, new ArrayList<String>());
            storage.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(storage.containsKey(storageUnit)) {
            return storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if(storage.containsKey(storageUnit)) {
            for(int i=0;i<storage.get(storageUnit).size();i++) {
                if(storage.get(storageUnit).get(i).equals(item)) {
                    storage.get(storageUnit).remove(i);
                    break;
                }
            }
            if(storage.get(storageUnit).size()==0) {
                storage.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String unit : storage.keySet()) {
            units.add(unit);
        }
        return units;
    }
    
}
