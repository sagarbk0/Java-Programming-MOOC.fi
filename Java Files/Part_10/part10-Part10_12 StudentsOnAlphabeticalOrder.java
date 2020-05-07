

public class Student implements Comparable<Student> {
	
	// I implemented the compareTo method

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student t) {
        return getName().compareTo(t.getName());
    }
    
    

}
