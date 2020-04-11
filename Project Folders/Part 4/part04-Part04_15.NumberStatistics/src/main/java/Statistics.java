
import java.util.ArrayList;


public class Statistics {
    
    private int sum;
    private ArrayList<Integer> nums = new ArrayList<Integer>();

    public Statistics() {
        this.sum=0;
    }

    public void addNumber(int number) {
        this.nums.add(number);
        this.sum+=number;
    }

    public int getCount() {
        return this.nums.size();
    }
    
    public int sum(){
//        for(int i=0;i<this.nums.size();i++){
//            this.sum+=this.nums.get(i);
//        }
        return this.sum;
    }
    
    public double average(){
        if(this.nums.isEmpty()){
            return 0;
        }
        return (double)this.sum()/(double)this.nums.size();
    }
    
}
