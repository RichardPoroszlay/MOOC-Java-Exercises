
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList<String> words = new ArrayList<>();

    // we create a scanner for reading the file
    try (Scanner fileReader = new Scanner(Paths.get(file))) {
        // we read all the lines of the file
        while (fileReader.hasNextLine()) {
            words.add(fileReader.nextLine());
        }
        
    } catch (Exception e) {
        System.out.println("Reading the file " + file + " failed.");
    }
    
        for(String word : words) {
            if(words.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
        }
    }
    
}
