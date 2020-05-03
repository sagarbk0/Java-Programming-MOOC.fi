/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Cat extends Animal implements NoiseCapable {
    private String name;
    
    public Cat(String name) {
        super(name);
        this.name=super.getName();
    }
    
    public Cat() {
        super("Cat");
        this.name=super.getName();
    }
    
    public void purr() {
        System.out.println(name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
    
}
