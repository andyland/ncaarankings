package com.andymcsherry.ncaarankings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {
        Map<String, Integer> gamesPerTeam = new HashMap<String, Integer>();
        
        Map<String, Double> currentValuesPerTeam = new HashMap<String, Double>();
        Map<String, Double> nextValuesPerTeam = new HashMap<String, Double>();
        
        for (int i = 0; i < 20; i++) {
            currentValuesPerTeam = nextValuesPerTeam;
            nextValuesPerTeam = new HashMap<String, Double>();
            for (String[] game : Data.SCORES) {
                String team1 = game[0];
                int team1Score = Integer.parseInt(game[1]);
                String team2 = game[2];
                int team2Score = Integer.parseInt(game[3]);

                if (!currentValuesPerTeam.containsKey(team1)) {
                    currentValuesPerTeam.put(team1, .5);
                }
                if (!currentValuesPerTeam.containsKey(team2)) {
                    currentValuesPerTeam.put(team2, .5);
                }
                if (team1Score > team2Score) {
                    if (nextValuesPerTeam.containsKey(team1)) {
                        nextValuesPerTeam.put(team1, nextValuesPerTeam.get(team1) + Math.sqrt(currentValuesPerTeam.get(team2)));
                    } else {
                        nextValuesPerTeam.put(team1, Math.sqrt(currentValuesPerTeam.get(team2)));
                    }
                    if (nextValuesPerTeam.containsKey(team2)) {
                        nextValuesPerTeam.put(team2, nextValuesPerTeam.get(team2) - Math.sqrt(1 - currentValuesPerTeam.get(team1)));
                    } else {
                        nextValuesPerTeam.put(team2, - Math.sqrt(1 - currentValuesPerTeam.get(team1)));
                    }
                } else if (team1Score < team2Score) {
                    if (nextValuesPerTeam.containsKey(team1)) {
                        nextValuesPerTeam.put(team1, nextValuesPerTeam.get(team1) - Math.sqrt(1 - currentValuesPerTeam.get(team2)));
                    } else {
                        nextValuesPerTeam.put(team1, - Math.sqrt(1 - currentValuesPerTeam.get(team2)));
                    }
                    if (nextValuesPerTeam.containsKey(team2)) {
                        nextValuesPerTeam.put(team2, nextValuesPerTeam.get(team2) + Math.sqrt(currentValuesPerTeam.get(team1)));
                    } else {
                        nextValuesPerTeam.put(team2, Math.sqrt(currentValuesPerTeam.get(team1)));
                    }
                }
                
                if (i == 0) {
                    if (gamesPerTeam.containsKey(team1)) {
                        gamesPerTeam.put(team1, gamesPerTeam.get(team1) + 1);
                    } else {
                        gamesPerTeam.put(team1, 1);
                    }
                    if (gamesPerTeam.containsKey(team2)) {
                        gamesPerTeam.put(team2, gamesPerTeam.get(team2) + 1);
                    } else {
                        gamesPerTeam.put(team2, 1);
                    }
                }
            }
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            for (Double value : nextValuesPerTeam.values()) {
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
            for (String key : nextValuesPerTeam.keySet()) {
                double value = nextValuesPerTeam.get(key);
                value = (value - min) / (max - min);
                nextValuesPerTeam.put(key, value);
            }
            
            for (String s : Data.DIVISION_TWO_SET) {
                nextValuesPerTeam.put(s, 0.0);
            }
        }
        
        ArrayList<Entry<String, Double>> sorted = new ArrayList<Entry<String,Double>>(nextValuesPerTeam.entrySet());
        Collections.sort(sorted, new Comparator<Entry<String, Double>>() {

            @Override
            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
                return (int)Math.signum(o2.getValue() - o1.getValue());
            }
        });
        for (int i = 0; i < sorted.size(); i++) {
            Entry<String, Double> team = sorted.get(i);
            if (!Data.DIVISION_TWO_SET.contains(team.getKey())) {
                System.out.println((i < 9 ? " " : "") + (i + 1) +". " + team.getKey() + ": " + team.getValue());
            }
        }
        
//        ArrayList<Entry<String, Integer>> sortedGamesPerTeam = new ArrayList<Entry<String,Integer>>(gamesPerTeam.entrySet());
//        Collections.sort(sortedGamesPerTeam, new Comparator<Entry<String, Integer>>() {
//
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o2.getValue() - o1.getValue();
//            }
//        });
//        for (Entry<String, Integer> team : sortedGamesPerTeam) {
//            if (!Data.DIVISION_TWO_SET.contains(team.getKey())) {
//                System.out.println(team.getKey() + ": " + team.getValue());
//            }
//        }
    }

}
