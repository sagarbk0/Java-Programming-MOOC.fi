/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class ProductWarehouse extends Warehouse {
    private String productName;
//    private double capacity;
//    private double balance;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName=productName;
    }
    
    public String getName(){
        return productName;
    }
    
    public void setName(String newName){
        productName=newName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
    
    
}
