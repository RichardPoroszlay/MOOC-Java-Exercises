// implement an interactive program using OOP paradigm
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
             
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // it adds some amount of liquid to first
            if(command.equals("add")) {
                first.add(amount);
            }
            
            // it moves some amount of liquid from first to second
            
            if(command.equals("move")) {
                if(first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }                
            }
                    
            // it removes some amount of liquid from second
            if(command.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}
