
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Match> matches = new ArrayList<>();
        
        
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitorTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitorTeamPoints = Integer.valueOf(parts[3]);
                matches.add(new Match(homeTeam, visitorTeam, homeTeamPoints, visitorTeamPoints));                                            
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    
        int total = 0;
        for(Match match : matches) {
            if(match.getHomeTeam().equals(team) || match.getVisitorTeam().equals(team)) {
                ++total;
            }
        }
        System.out.println("Games: " + total);
        
        int losses = 0;
        int wins = 0;
        
        for(Match match : matches) {
            if(match.getHomeTeam().equals(team)) {
                if(match.getHomeTeamPoints() > match.getVisitorTeamPoints()) {
                    ++wins;
                } else {
                    ++losses;
                }
            } else if(match.getVisitorTeam().equals(team)) {
                if(match.getHomeTeamPoints() < match.getVisitorTeamPoints()) {
                    ++wins;
                } else {
                    ++losses;
                }
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
