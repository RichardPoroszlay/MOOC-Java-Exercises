import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.stack.size() == 0) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
     
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        String lastElement = this.stack.get(this.stack.size()-1);
        this.stack.remove(lastElement);
        return lastElement;
    }
    
}
