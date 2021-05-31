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
public class SoccerProject {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();

        Scanner in = new Scanner(System.in);

        Team[] teams = new Team[4];

        ArrayList<Game> gameList = new ArrayList<>();
        for (int x = 0; x < teams.length; x++) {
            teams[x] = new Team("Team " + (x + 1));
        }

        int coldCounter = 0;
        int idCounter = 1;
        
        while (coldCounter < 3) {
            System.out.println("Please enter today's temperature:");
            int temp = in.nextInt();
            
            if (temp > 0) {
                coldCounter = 0;
                ArrayList<Integer> valueList = new ArrayList<>();
                for (int x = 0; x < 4; x++) {
                    valueList.add(x);
                }
                int team1 = valueList.remove(rnd.nextInt(valueList.size()));
                int team2 = valueList.remove(rnd.nextInt(valueList.size()));
                int team3 = valueList.remove(rnd.nextInt(valueList.size()));
                int team4 = valueList.remove(0);
                
                Game g1 = new Game(teams[team1], teams[team2], temp, idCounter++, rnd);
                teams[team1] = g1.getT1();
                teams[team2] = g1.getT2();
                Game g2 = new Game(teams[team3], teams[team4], temp, idCounter++, rnd);
                gameList.add(g1);
                gameList.add(g2);

                System.out.println("\nGame 1 between " + g1.getT1().getName() + " and " + g1.getT2().getName());
                System.out.println("Game 2 between " + g2.getT1().getName() + " and " + g2.getT2().getName() + "\n");

            } else {
                coldCounter++;
                System.out.println("It's too cold to play.");
            }
        }

        System.out.println("\n\n\nEnd of Season\n\n*********Results and Stats*********\n");
        System.out.println("\n******Team Stats******");
        for (Team x : teams) {
            System.out.println("\n"+x.getName());
            System.out.println("Goals Scored: " + x.getGoalsScored());
            System.out.println("Goals Conceded: " + x.getGoalsCounted());
            System.out.println("Win Total: " + x.getWinTotal());
            System.out.println("Loss Total: " + x.getLossTotal());
            System.out.println("Tie Total: " + x.getTieTotal());

        }
        
        System.out.println("\n\n******Game Stats******");
        
        int hottest = 0;
        double average = 0;

        for (Game x : gameList) {
            System.out.println("\nGame " + x.getId() + ":");
            System.out.println("Temperature " + x.getTemp() + "°C");
            System.out.println("Home Team: " + x.getT1().getName());
            System.out.println("Away Team: " + x.getT2().getName());
            average += x.getTemp();
            if (hottest < x.getTemp()) {
                hottest = x.getTemp();
            }

        }
        average = average / (gameList.size());
        System.out.println("\n");
        System.out.println("Hottest Temperature: " + hottest + "°C");
        System.out.println("Average Temperature: " + ((average)*10)/10 + "°C");
    }
}
