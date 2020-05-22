
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(m -> System.out.println(m));
//        for (Card card: cards) {
//            System.out.println(card);
//        }
    }
    
    public void sort() {
        Collections.sort(cards);
//        cards.stream().sorted();
//        for (int i=0; i<cards.size(); i++) {
//            if(cards.get(i).compareTo(cards.get(i+1))>0) {
//                
//            }
//        }
    }
    
    public ArrayList<Card> getCards () {
        return this.cards;
    }

    @Override
    public int compareTo(Hand t) {
        int sum1 = 0;
        int sum2 = 0;
        for (Card card : cards) {
            sum1 += card.getValue();
        }
        for (Card card : t.getCards()) {
            sum2 += card.getValue();
        }
        return sum1 - sum2;
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);
    }
}
