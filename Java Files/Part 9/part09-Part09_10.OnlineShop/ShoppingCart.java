
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<String, Item>();
    }
    
    public void add(String product, int price){
        if(!cart.containsKey(product)) {
            cart.put(product, new Item(product, 1, price));
        } else {
            cart.get(product).increaseQuantity();
        }
    }
    
    public int price(){
        int price=0;
        for (String key : cart.keySet()) {
            price=price+cart.get(key).price();
        }
        return price;
    }
    
    public void print() {
        for (String key : cart.keySet()) {
            System.out.println(cart.get(key));
        }
    }
}
