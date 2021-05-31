/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

/**
 *
 * @author myfam
 */
public class Team {

    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int goalsScored;
    private int goalsCounted;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinTotal() {
        return winTotal;
    }

    public void setWinTotal(int winTotal) {
        this.winTotal = winTotal;
    }

    public int getLossTotal() {
        return lossTotal;
    }

    public void setLossTotal(int lossTotal) {
        this.lossTotal = lossTotal;
    }

    public int getTieTotal() {
        return tieTotal;
    }

    public void setTieTotal(int tieTotal) {
        this.tieTotal = tieTotal;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsCounted() {
        return goalsCounted;
    }

    public void setGoalsCounted(int goalsCounted) {
        this.goalsCounted = goalsCounted;
    }

    
}
