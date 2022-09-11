
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter test = new Counter(5);
        
        test.increase();
        test.increase(9);
        test.decrease();
        test.decrease(3);
        
        System.out.println(test.value());
    }
}
