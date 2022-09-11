
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true) {
            String textToBeSplitted = scanner.nextLine();
            if(textToBeSplitted.equals("")) {
                break;
            }
            String split[] = textToBeSplitted.split(" ");
            
            int index = 0;
            while(index < split.length) {
                System.out.println(split[index]);
                ++index;
            }
        }
              
              
    }
}
