
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Bhatt
 */
public class Employees {
    private List<Person> persons;
    
    public Employees () {
        persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }
    
    public void add(List peopleToAdd) {
        peopleToAdd.stream().forEach(e -> persons.add((Person)e));
    }
    
    public void print() {
        Iterator <Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator <Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(Education.valueOf(education.toString()))) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator <Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(Education.valueOf(education.toString()))) {
                iterator.remove();
            }
        }
    }
}
