
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true) {
            String details = scanner.nextLine();
            if(details.equals("")) {
                break;
            }
            String splitted[] = details.split(",");
            
        
            for(int i = 1; i < splitted.length; i += 2) {
                // System.out.println(splitted[i]);
                if(Integer.valueOf(splitted[i]) > oldest) {
                    oldest = Integer.valueOf(splitted[i]);
                }
            }          
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
