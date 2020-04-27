
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary = null;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if (dictionary.containsKey(word)){
            dictionary.get(word).add(translation);
        } else {
            dictionary.put(word, new ArrayList<String>());
            dictionary.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return new ArrayList<String>();
    }
    
    public void remove(String word){
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }
}
