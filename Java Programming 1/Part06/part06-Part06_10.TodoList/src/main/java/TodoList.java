// Part 1
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        int counter = 1;
        for(String task : list) {
            System.out.println(counter + ": " + task);
            ++counter;
        }
    }
    
    public void remove(int number) {
        this.list.remove(this.list.get(number-1));
    }
}
