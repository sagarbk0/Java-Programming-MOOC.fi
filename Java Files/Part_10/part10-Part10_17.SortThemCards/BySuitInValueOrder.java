/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;

/**
 *
 * @author Sagar Bhatt
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card t, Card t1) {
        if(t.getSuit().ordinal()==t1.getSuit().ordinal()) {
            return t.getValue()-t1.getValue();
        }
        return t.getSuit().ordinal() - t1.getSuit().ordinal();
    }
    
}
