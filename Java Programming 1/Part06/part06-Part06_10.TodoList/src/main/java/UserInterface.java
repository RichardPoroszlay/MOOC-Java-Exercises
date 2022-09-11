// Part 2
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.println("To add:");
                String addedTask = this.scanner.nextLine();
                this.list.add(addedTask);
            }
            
            if(command.equals("list")) {
                this.list.print();
            }
            
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(removed);
            }
        }
    }
}
    
