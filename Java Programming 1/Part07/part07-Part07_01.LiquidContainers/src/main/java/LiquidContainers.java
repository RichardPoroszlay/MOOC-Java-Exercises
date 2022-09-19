// implement an interactive program using procedural programming paradigm
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            
             if (input.equals("quit")) {
                break;
            }
             
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // it adds some amount of liquid to first
            if(command.equals("add")) {
                if(amount < 0) {
                    continue;
                }
                first += amount;
                if(first > 100) {
                    first = 100;
                }
            }
            
            // it moves some amount of liquid from first to second
            if(command.equals("move")) {
                if(first < amount) {
                    second += first;
                } else {
                    second += amount;
                }
                first -= amount;
                  
                if(first < 0) {
                    first = 0;
                }
                if(second > 100) {
                    second = 100;
                }    
            }
            
            // it removes some amount of liquid from second
            if(command.equals("remove")) {
                second -= amount;
                if(second < 0) {
                    second = 0;
                }
            }
        }
    }

}
