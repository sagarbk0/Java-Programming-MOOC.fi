package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {
    
    private int id;
    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
        this.id = 1;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            
            if(command.equals("1")) {
                list();
            }
            
            if(command.equals("2")) {
                add();
            }
            
            if(command.equals("3")) {
                markAsDone();
            }
            
            if(command.equals("4")) {
                remove();
            }
            // implement the functionality here
        }

        System.out.println("Thank you!");
    }
    
    private void list() throws SQLException {
        System.out.println("Listing the database contents");
        this.database.list().stream().forEach(todo -> {
            System.out.println(todo.toString());
        });
    }
    
    private void add() throws SQLException {
        System.out.println("Adding a new todo\nEnter name");
        String name = this.scanner.nextLine();
        System.out.println("Enter description");
        String description = this.scanner.nextLine();
        Todo todo = new Todo(this.id, name, description, false);
        this.id++;
        this.database.add(todo);
    }
    
    private void markAsDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        String doneId = this.scanner.nextLine();
        this.database.markAsDone(Integer.parseInt(doneId));
    }
    
    private void remove() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        String removeId = this.scanner.nextLine();
        this.database.remove(Integer.parseInt(removeId));
    }
}
