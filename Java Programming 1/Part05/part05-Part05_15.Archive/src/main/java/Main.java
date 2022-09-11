import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Archive> archiveList = new ArrayList<>();
        Archive archive;
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            archive = new Archive(id, name);
            if (!archiveList.contains(archive)) {
                archiveList.add(archive);
            }

        }
        System.out.println("==Items==");
        for (Archive archives : archiveList) {
            System.out.println(archives);
        }
    }
}