
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int sum = 0;
        
        int longestName = 0;
        String name = "";
        
        while(true) {
            String details = scanner.nextLine();
            if(details.equals("")) {
                break;
            }
            
            String splitted[] = details.split(",");
            
            for(int i = 0; i < splitted.length; ++i) {
                ++total;
            }
            
            for(int i = 1; i < splitted.length; i += 2) {
                sum += Integer.valueOf(splitted[i]);
            }
            
            for(int i = 0; i < splitted.length; i += 2) {
                if(splitted[i].length() > longestName) {
                    longestName = Integer.valueOf(splitted[i].length());
                    name = splitted[i];
                }
            }
        }
        
        double average = sum / (double)(total/2);
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
