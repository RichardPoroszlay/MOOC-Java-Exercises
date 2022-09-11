
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = number1 + number2;
        
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
