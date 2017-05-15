package com.bashynskiy.runners.homework.lesson15;

import com.bashynskiy.app.homework.lesson15.FootballClub;
import com.bashynskiy.app.homework.lesson15.SportsClub;

/**
 * Created by admin on 16.05.2017.
 */
public class FootballRunner {
    public static void main(String[] args) {
        SportsClub sportsClub = new FootballClub();
        sportsClub.draws(20);
        sportsClub.defeats(15);
        sportsClub.wins(12);
        sportsClub.showStatistic();
    }
}
