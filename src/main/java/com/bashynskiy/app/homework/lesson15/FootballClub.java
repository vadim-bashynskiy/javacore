package com.bashynskiy.app.homework.lesson15;

/**
 * Created by admin on 16.05.2017.
 */
public class FootballClub extends SportsClub {
    private int wins;
    private int draws;
    private int defeats;
    private String name;
    private String location;

    public String showLocation(String location){
        setLocation(location);
        return getLocation();
    }

    @Override
    public String showName(String name) {
        setName(name);
        return getName();
    }
    @Override
    public void showStatistic(){
        System.out.println("Football club : " + showName("Dynamo") + " Location in " + showLocation("Ukraine") + " Statistic :" + "Wins = " + getWins() + " draws = " + getDraws() + " defeats = " + getDefeats());
    }

    @Override
   public void wins(int wins) {
        setWins(wins);
    }

    @Override
    public void draws(int draws) {
    setDraws(draws);
    }

    @Override
    public void defeats(int defeats) {
    setDefeats(defeats);
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
