
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String something = scanner.nextLine();
            if(something.equals("")) {
                break;
            }
            String splitted[] = something.split(" ");
            
            System.out.println(splitted[splitted.length-1]);
        }

    }
}
