
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String something = scanner.nextLine();
            if(something.equals("")) {
                break;
            }
                  
            String splitted[] = something.split(" ");
            
            for(int i = 0; i < splitted.length; ++i) {
                if(splitted[i].contains("av")) {
                    System.out.println(splitted[i]);
                }
            }
        }

    }
}
