// Part 6 - Creating Hold-class
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for(Suitcase sc : this.suitcases) {
            totalWeight += sc.totalWeight();
        }
        if(totalWeight + suitcase.totalWeight() <= this.maxWeight && totalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "There aren't any suitcases";
        }
        
        int total = 0;
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases) {
            ++total;
            totalWeight += suitcase.totalWeight();
        }
        return total + " suitcases (" + totalWeight + " kg)";
    }
    
    // Part 7
    public void printItems() {
        for(Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
