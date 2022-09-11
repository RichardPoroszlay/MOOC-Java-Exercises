
import java.util.Scanner;

public class NameOfTheOldest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
 
        while(true) {
            String details = scanner.nextLine();
            if(details.equals("")) {
                break;
            }
            
            String splitted[] = details.split(",");
            
            for(int i = 1; i < splitted.length; i+=2) {
                if(Integer.valueOf(splitted[i]) > oldest) {
                    oldest = Integer.valueOf(splitted[i]);
                }
            }
            
            for(int i = 0; i < splitted.length; ++i) {
                if(splitted[i].equals(String.valueOf(oldest))) {
                    name = splitted[i-1];                   
                }
            }
               
        }
        System.out.println("Name of the oldest: " + name);

    }
}
