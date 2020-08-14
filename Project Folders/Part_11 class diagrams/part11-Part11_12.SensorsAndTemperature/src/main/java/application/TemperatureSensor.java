/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Sagar Bhatt
 */
public class TemperatureSensor implements Sensor {
    private int on;
    
    public TemperatureSensor() {
        on = 0;
    }

    @Override
    public boolean isOn() {
        if(on==1) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        on=1;
    }

    @Override
    public void setOff() {
        on=0;
    }

    @Override
    public int read() {
        if(isOn()) {
            return new Random().nextInt(61)-30;
        } else {
            throw new IllegalStateException("The sensor is off");
        }
    }
    
}
