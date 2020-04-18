
import java.util.HashMap;

public class SimpleDictionary {
    
    //This class was already given. I only implemented TextUI.java

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
