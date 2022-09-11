/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricsi
 */
public class Match {
    private String homeTeam;
    private String visitorTeam;
    private int homeTeamPoints;
    private int visitorTeamPoints;
    
    public Match(String homeTeam, String visitorTeam, int homeTeamPoints, int visitorTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitorTeamPoints = visitorTeamPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitorTeam() {
        return this.visitorTeam;
    }
    
    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }
    
    public int getVisitorTeamPoints() {
        return this.visitorTeamPoints;
    }
}
