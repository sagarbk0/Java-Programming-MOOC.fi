
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Warehouse {
    
    private Map<String, Integer> map;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.map = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        map.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(map.containsKey(product)) {
            return map.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)) {
            return stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stocks.containsKey(product) && stocks.get(product)>=1) {
            stocks.replace(product, stocks.get(product)-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> prods = map.keySet();
        return prods;
    }
    
}
