
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for?");
        String searchFor = scanner.nextLine();
        for(String name : list) {
            if(list.contains(searchFor)) {
                System.out.println(searchFor + " was found!");
                break;
            } else {
                System.out.println(searchFor + " was not found!");
                break;
            }
         
         }
    }
}
