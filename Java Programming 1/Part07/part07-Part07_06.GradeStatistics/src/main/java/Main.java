import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point points = new Point();
        
        // Numbers between [0-100] are acceptable
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            } else if(number < 0 || number > 100) {
                continue;
            }
            points.add(number);
        }
        System.out.println("Point average (all): " + points.getAverageAll());
        System.out.println("Point average (passing): " + points.getAveragePassing());
        System.out.println("Pass percentage: " + points.passPercentage());
        
        
        GradeDistribution totalGrades = new GradeDistribution(points);
        totalGrades.counting(points);
        
        System.out.println("Grade distribution:");
        totalGrades.gradeFiveStars();
        totalGrades.gradeFourStars();
        totalGrades.gradeThreeStars();
        totalGrades.gradeTwoStars();
        totalGrades.gradeOneStars();
        totalGrades.failStars();
        
        
        
    }
}
