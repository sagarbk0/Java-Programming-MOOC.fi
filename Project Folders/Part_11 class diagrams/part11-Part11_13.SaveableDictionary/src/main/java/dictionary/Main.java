package dictionary;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        SaveableDictionary dictionary = new SaveableDictionary();
//    dictionary.add("apina", "monkey");
//    dictionary.add("banaani", "banana");
//    dictionary.add("apina", "apfe");
//
//    System.out.println(dictionary.translate("apina"));
//    System.out.println(dictionary.translate("monkey"));
//    System.out.println(dictionary.translate("ohjelmointi"));
//    System.out.println(dictionary.translate("banana"));

//SaveableDictionary dictionary = new SaveableDictionary("words.txt");
//boolean wasSuccessful = dictionary.load();
//
//if (wasSuccessful) {
//    System.out.println("Successfully loaded the dictionary from file");
//}
//
//System.out.println(dictionary.translate("apina"));
//System.out.println(dictionary.translate("ohjelmointi"));
//System.out.println(dictionary.translate("alla oleva"));
//dictionary.add("me","mo");
//System.out.println(dictionary.translate("me"));
////        System.out.println(dictionary.save());
//SaveableDictionary s = new SaveableDictionary("word.txt");
//        System.out.println(s.translate("apina"));
SaveableDictionary s = new SaveableDictionary("words.txt");
s.load();
s.translate("olut");
s.save();
    }
}
