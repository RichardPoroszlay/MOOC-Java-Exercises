

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(10);
    }
    
    public static void printFromNumberToOne(int number) {
        while(number >= 1) {
            System.out.println(number);
            --number;
        }
    }

}
