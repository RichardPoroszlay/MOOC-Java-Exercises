import java.util.ArrayList;

public class Point {
    private ArrayList<Integer> points;
    private final int MIN_POINTS = 50;  // minimum points to success
    
    public Point() {
        this.points = new ArrayList<>();
    }
    
    // adds a number to the list
    public void add(int number) {
        this.points.add(number);
    }
    
    // returns the size of the array 
    public int size() {
        if(this.points.isEmpty()) {
            return -1;
        }
        int total = 0;
        for(int i = 0; i < this.points.size(); ++i) {
            ++total;
        } 
        return total;
    }
    
    // return an element of a given index
    public int get(int index) {
        for(int i = 0; i < this.points.size(); ++i) {
            if(i == index) {
                return this.points.get(index);
            }
        }
        return -1;
    } 
    
    // returns the average of a list containing numbers
    public double getAverageAll() {
        int sum = 0;
        int total = 0;
        
        for(int i = 0; i < this.points.size(); ++i) {
            sum += points.get(i);
            ++total;
        }
        
        return (double)sum/total;
    }
    
    // return the average of points that are above 50 points
    public String getAveragePassing() {
        int sum = 0;
        int total = 0;
        
        for(int i = 0; i < this.points.size(); ++i) {
            if(points.get(i) < this.MIN_POINTS) {
                continue;
            } else {
                sum += points.get(i);
                ++total;
            }
        }
        if(sum == 0 && total == 0) {
            return "-"; // this is the reason why the method returns String
        }
        
        return Double.toString((double)sum/total);
    }
    
    // returns the percentage of passed points
    public double passPercentage() {
        double passing = 0; // points above 50
        int total = 0;  // number of participants (number of given inputs)
        
        for(int i = 0; i < this.points.size(); ++i) {
            if(points.get(i) >= 50) {
                ++passing;
            }
            ++total;
        }
        
        return 100*passing/total;   // formula of "pass percentage"
    }
    
}
