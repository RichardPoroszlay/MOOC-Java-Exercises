// Part 2 - Creating the Suitcase-class
// Part 3 - language formatting
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        
        for(Item i : this.items) {
            totalWeight += i.getWeight();    
        }
        
        if(totalWeight < this.maxWeight && !(item.getWeight() + totalWeight > this.maxWeight)) {
            this.items.add(item);
        }
    }
        
  
    
    public String toString()  {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        
        int totalItems = 0;
        int totalWeight = 0;
         for(Item item : this.items) {
             ++totalItems;
             totalWeight += item.getWeight();
         }
         return totalItems + " items (" + totalWeight + " kg)";
                 
    }
    
    // Part 4
    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item);
        }
    }
        
    // Part 4
    public int totalWeight() {
        int totalWeight = 0;
        for(Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    // Part 5
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(Item item : this.items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
      
    }    
}