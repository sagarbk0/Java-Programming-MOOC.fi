
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
public class IOU {
    
    private HashMap<String, Double> iou = null;
    
    public IOU(){
        iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        if(iou.containsKey(toWhom)) {
            return iou.get(toWhom); 
        }
        return 0.0;
    }
}
