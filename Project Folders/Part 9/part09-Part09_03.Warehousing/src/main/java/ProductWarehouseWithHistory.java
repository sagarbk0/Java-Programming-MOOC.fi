/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory chobj;
//    private double capacity;
//    private String productName;
//    private double balance;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.setBalance(initialBalance);
        chobj = new ChangeHistory();
        chobj.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        if(amount>=0 && (super.getBalance()+amount)<=super.getCapacity()) {
            super.setBalance(super.getBalance()+amount);
        }
        chobj.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        if(amount>=0){
            if((super.getBalance()-amount)>=0){
                super.setBalance(super.getBalance()-amount);
            } else {
                double j = super.getBalance();
                super.setBalance(0);
                chobj.add(super.getBalance());
                return j;
            }
        }
        chobj.add(super.getBalance());
        return amount;
    }
    
    public String history(){
        return chobj.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + chobj.maxValue());
        System.out.println("Smallest amount of product: " + chobj.minValue());
        System.out.println("Average: " + chobj.average());
    }
}
