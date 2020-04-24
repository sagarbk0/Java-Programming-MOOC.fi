
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners = null;
    
    public VehicleRegistry() {
        owners = new HashMap<>();
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.get(licensePlate)!=null){
            return false;
        }
        owners.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if(owners.containsKey(licensePlate)) {
            return owners.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> prowners = new ArrayList<>();
        for(LicensePlate licensePlate : owners.keySet()) {
            if(!prowners.contains(owners.get(licensePlate))) {
                System.out.println(owners.get(licensePlate));
                prowners.add(owners.get(licensePlate));
            }
        }
    }
    
}
