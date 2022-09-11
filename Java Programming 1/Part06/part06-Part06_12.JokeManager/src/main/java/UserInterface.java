// Part 2
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = this.scanner.nextLine();
            
            if(command.equals("X")) {
                break;
            }
            
            if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToBeAdded = this.scanner.nextLine();
                this.manager.addJoke(jokeToBeAdded);
            }
            
            if(command.equals("2")) {
                System.out.println(manager.drawJoke());
            }
            
            if(command.equals("3")) {
                this.manager.printJokes();
            }
            
        }
    }
}
