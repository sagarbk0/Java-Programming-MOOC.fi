/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sagar Bhatt
 */
public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private HashMap<String,String> dictionary2;
    private int fileSucc;
    private String file;
    
    public SaveableDictionary() {
        dictionary = new HashMap<>();
        dictionary2 = new HashMap<>();
    }
    
    public void add(String words, String translation){
        if(!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
            dictionary2.put(translation, words);
        }
    }
    
    public String translate (String word) {
        if(dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if(dictionary2.containsKey(word)) {
            return dictionary2.get(word);
        } else return null;
    }
    
    public void delete(String word) {
        if(dictionary.containsKey(word)) {
            dictionary2.remove(dictionary.get(word));
            dictionary.remove(word);
        }
        if(dictionary2.containsKey(word)) {
            dictionary.remove(dictionary2.get(word));
            dictionary2.remove(word);
        }
    }
    
    public SaveableDictionary(String file) {
        fileSucc = 1;
        dictionary = new HashMap<>();
        dictionary2 = new HashMap<>();
        this.file = file;
        
    }
    
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new FileReader(file));
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
                dictionary2.put(parts[1], parts[0]);
            }
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            for(String f : dictionary.keySet()) {
                System.out.println(f + ":" + dictionary.get(f));
                writer.println(f + ":" + dictionary.get(f));
            }
            for(String f : dictionary2.keySet()) {
                String g = dictionary2.get(f);
                if(!dictionary.containsKey(g)) {
                    writer.println(g + ":" + f);
                }
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
