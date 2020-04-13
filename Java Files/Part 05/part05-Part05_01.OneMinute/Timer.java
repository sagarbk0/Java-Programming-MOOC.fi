/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand mseconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.mseconds = new ClockHand(100);
    }
    
    public void advance(){
        this.mseconds.advance();
        if(this.mseconds.value()==0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds.toString() + ":" + mseconds.toString();
    }
    
}
