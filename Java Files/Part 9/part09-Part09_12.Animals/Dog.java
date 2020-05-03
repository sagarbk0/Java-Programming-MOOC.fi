/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Dog extends Animal implements NoiseCapable {
    private String name;

    public Dog (String name) {
        super(name);
        this.name=super.getName();
    }
    
    public Dog () {
        super("Dog");
        this.name=super.getName();
    }
    
    public void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
