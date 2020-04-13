/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Fitbyte {
    private double maximumHeartRate;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.maximumHeartRate=206.3 - (0.711 * age);
        this.restingHeartRate=restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ((this.maximumHeartRate-(double)this.restingHeartRate)*percentageOfMaximum+(double)this.restingHeartRate);
    }
    
}
