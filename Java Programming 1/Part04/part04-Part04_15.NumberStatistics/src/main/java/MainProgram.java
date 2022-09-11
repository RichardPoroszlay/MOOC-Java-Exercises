
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        /*
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        */
        
        Statistics statisticsTotal = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }
            
            if(number % 2 == 0) {
                statisticsEven.addNumber(number);
            } else if(number % 2 != 0) {
                statisticsOdd.addNumber(number);
            }
            
            statisticsTotal.addNumber(number);
           
        } 
        
        // sum all numbers
        System.out.println("Sum: " + statisticsTotal.sum());
        
        // sum even numbers
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        
        // sum odd numbers
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
