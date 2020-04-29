
public class Main {

    public static void main(String[] args) {
    Box box = new Box(10);
    Box box2 = new Box(5);

    box2.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2)) ;
    box2.add(new Book("Robert Martin", "Clean Code", 1));
    box2.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(box2);
    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(box);

    }

}
