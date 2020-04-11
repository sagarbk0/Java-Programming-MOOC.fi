/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xegon
 */
public class Team {
    private String name;
    private int games;
    private int wins;

    public Team(String name, int games, int wins) {
        this.name = name;
        this.games = games;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Games: " + games + "\nWins: " + 
                wins + "\nLosses: " + (games-wins);
    }
    
}
