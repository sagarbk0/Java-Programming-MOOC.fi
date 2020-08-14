/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sagar Bhatt
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        if(sensors.stream().filter(s -> !s.isOn()).
                collect(Collectors.toCollection(ArrayList::new)).size()!=0) {
            return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach(f -> f.setOn());
    }

    @Override
    public void setOff() {
        sensors.forEach(f -> f.setOff());
    }

    @Override
    public int read() {
        if(!isOn()) {
            throw new IllegalStateException("Warning: attempt to read while "
                    + "one or mre sensors are off");
        }
        int j = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        readings.add(j);
        return j;
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
}
