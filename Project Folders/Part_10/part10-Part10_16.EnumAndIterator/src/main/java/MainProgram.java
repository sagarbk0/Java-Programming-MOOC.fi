
public class MainProgram {

    public static void main(String[] args) {
//        Person anna = new Person("Anna", Education.PHD);
//        System.out.println(anna);
//        
//        Employees university = new Employees();
//        university.add(new Person("Petrus", Education.PHD));
//        university.add(new Person("Arto", Education.HS));
//        university.add(new Person("Elina", Education.PHD));
//
//        university.print();
//        university.print(Education.HS);
//        university.fire(Education.HS);
//        university.print();
        
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.PHD); 
        t.add(h); 
        t.fire(Education.PHD); 
        t.print();
    }
}
