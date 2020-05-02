/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    
    public int price(){
        return qty*unitPrice;
    }
    
    public void increaseQuantity(){
        qty++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
    
}
