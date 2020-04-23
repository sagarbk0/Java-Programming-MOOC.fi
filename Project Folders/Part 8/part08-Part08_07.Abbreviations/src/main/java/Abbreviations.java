
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
public class Abbreviations {
    private HashMap<String, String> abbrs = null;

    public Abbreviations() {
        this.abbrs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation = sclean(abbreviation);
        explanation = sclean(explanation);
        abbrs.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        abbreviation = sclean(abbreviation);
        return abbrs.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        abbreviation = sclean(abbreviation);
        if(hasAbbreviation(abbreviation)==true) {
            return abbrs.get(abbreviation);
        }
        return null;
    }
    
    public static String sclean (String string) {
        if(string==null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
    
}
