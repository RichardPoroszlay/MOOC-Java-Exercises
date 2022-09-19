
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPositives = 0;
        int sumPositives = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            }
            
            if(number > 0) {
                totalPositives += 1;
                sumPositives += number;
            }
        }
        
        if(totalPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sumPositives / totalPositives);
        }
       
    }
}
