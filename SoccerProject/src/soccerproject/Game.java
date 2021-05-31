/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

import java.util.*;

/**
 *
 * @author myfam
 */
public class Game {

    private Team t1;
    private Team t2;
    private int temp;
    private int id;
    private int t1Score;
    private int t2Score;

    public Game(Team t1, Team t2, int temp, int id, Random rnd) {
        this.t1 = t1;
        this.t2 = t2;
        this.temp = temp;
        this.id = id;
        
        
        
        t1Score = rnd.nextInt(1 + this.temp / 5);
        t2Score = rnd.nextInt(1 + this.temp / 5);
        
        t1.setGoalsScored(t1.getGoalsScored() + t1Score);
        t1.setGoalsCounted(t1.getGoalsCounted() + t2Score);
        
        if (t1Score > t2Score) {
            t1.setWinTotal(t1.getWinTotal() + 1);
            t2.setLossTotal(t2.getLossTotal() + 1);
        } else if (t1Score < t2Score) {
            t1.setLossTotal(t1.getLossTotal() + 1);
            t2.setWinTotal(t2.getWinTotal() + 1);
        } else {
            t1.setTieTotal(t1.getTieTotal() + 1);
            t2.setTieTotal(t2.getTieTotal() + 1);
        }

    }
    

    public Team getT1() {
        return t1;
    }

    public void setT1(Team t1) {
        this.t1 = t1;
    }

    public Team getT2() {
        return t2;
    }

    public void setT2(Team t2) {
        this.t2 = t2;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getT1Score() {
        return t1Score;
    }

    public void setT1Score(int t1Score) {
        this.t1Score = t1Score;
    }

    public int getT2Score() {
        return t2Score;
    }

    public void setT2Score(int t2Score) {
        this.t2Score = t2Score;
    }

}
