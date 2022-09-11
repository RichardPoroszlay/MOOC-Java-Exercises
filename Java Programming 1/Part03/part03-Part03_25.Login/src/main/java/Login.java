
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        if(username.equals("alex")) {
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            if(password.equals("sunshine")) {
                System.out.println("You have succesfully logged in!");   
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else if (username.equals("emma")) {
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            if(password.equals("haskell")) {
                System.out.println("You have succesfully logged in!");   
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
              
    }
}
