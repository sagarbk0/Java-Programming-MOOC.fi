
import java.util.Objects;

public class LicensePlate {
    //I implemented the hashCode() and equal() methods
    
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    public int hashCode(){
        return (int)this.country.hashCode() + (int)this.liNumber.hashCode();
    }
    
    public boolean equals(Object object){
        if(!object.getClass().equals(this.getClass())){
            return false;
        }
        LicensePlate test = (LicensePlate) object;
        if(test.toString().equals(this.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
