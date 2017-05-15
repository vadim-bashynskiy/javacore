package com.bashynskiy.app.homework.lesson15;

/**
 * Created by admin on 16.05.2017.
 */
//Design and implement classes SportsClub (abstract class), FootballClub. SportsClub should include showName(),
// showLocation, showStatistic()  and hold information about name of the club, its location and various statistics about the club.
// FootballClub should include statistics such as how many wins, draws and defeats( wins(), draws(),
// defeats() - abstracts methods should be defined in SportsClub) (Implement abstract methods in SportsClub and override in FootballClub).
public abstract class SportsClub {

    public String showName(String name){
        return name;
    }
    public String showLocation(String location){
        return location;
    }
    public abstract void showStatistic();
    public abstract void wins(int wins);
    public abstract void draws(int draws);
    public abstract void defeats(int defeats);
}
