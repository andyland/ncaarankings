
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {
        Map<String, Integer> gamesPerTeam = new HashMap<String, Integer>();
        
        Map<String, Double> currentValuesPerTeam = new HashMap<String, Double>();
        Map<String, Double> nextValuesPerTeam = new HashMap<String, Double>();
        Map<String, Double> strengthOfSchedule = new HashMap<String, Double>();
        Map<String, Integer> wins = new HashMap<String, Integer>();
        Map<String, Integer> losses = new HashMap<String, Integer>();
        
        for (String[] game : Data.SCORES) {
            String team1 = game[0];
            String team2 = game[2];
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
            if (Integer.parseInt(game[1]) > Integer.parseInt(game[3])) {
            	wins.put(team1, wins.getOrDefault(team1, 0) + 1);
            	losses.put(team2, losses.getOrDefault(team2, 0) + 1);
            } else {
            	wins.put(team2, wins.getOrDefault(team2, 0) + 1);
            	losses.put(team1, losses.getOrDefault(team1, 0) + 1);	
            }
        }
        
        // Data stops changing around iteration 50
        for (int i = 0; i < 100; i++) {
            currentValuesPerTeam = nextValuesPerTeam;
            nextValuesPerTeam = new HashMap<String, Double>();
            
            for (String[] game : Data.SCORES) {
                String team1 = game[0];
                int team1Score = Integer.parseInt(game[1]);
                String team2 = game[2];
                int team2Score = Integer.parseInt(game[3]);
            
                if (team1Score > team2Score) {
                	nextValuesPerTeam.put(team1, 
                			nextValuesPerTeam.getOrDefault(team1, 0.0) 
                			+ (currentValuesPerTeam.getOrDefault(team2, 0.5)));
                	nextValuesPerTeam.put(team2, 
                			nextValuesPerTeam.getOrDefault(team2, 0.0) 
                			- (1 - currentValuesPerTeam.getOrDefault(team1, 0.5)));
                } else if (team1Score < team2Score) {
                    nextValuesPerTeam.put(team1, 
                    		nextValuesPerTeam.getOrDefault(team1, 0.0) 
                    		- (1 - currentValuesPerTeam.getOrDefault(team2, 0.5)));
                    nextValuesPerTeam.put(team2, 
                    		nextValuesPerTeam.getOrDefault(team2, 0.0) 
                    		+ (currentValuesPerTeam.getOrDefault(team1, 0.5)));
                }
            }
            
            // Weight based on number of games played
            int maxGames = -1;
            for (int games : gamesPerTeam.values()) {
                maxGames = Math.max(games, maxGames);
            }
            for (String team : nextValuesPerTeam.keySet()) {
                if (!Data.FCS_TEAMS.contains(team)) {
                    int numGames = gamesPerTeam.get(team);
                    double value = nextValuesPerTeam.get(team);
                    value = value * maxGames / numGames;
                    nextValuesPerTeam.put(team, value);
                }
            }
            
            // Normalize between 0.0 - 1.0
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            for (double value : nextValuesPerTeam.values()) {
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
            for (String team : nextValuesPerTeam.keySet()) {
                double value = nextValuesPerTeam.get(team);
                value = (value - min) / (max - min);
                nextValuesPerTeam.put(team, value);
            }
            
            // Reset all Division 1 FCS Schools to 0.0
            for (String s : Data.FCS_TEAMS) {
                nextValuesPerTeam.put(s, 0.0);
            }
        }
        
        for (String team : Data.FCS_TEAMS) {
            nextValuesPerTeam.remove(team);
        }
        for (String[] game : Data.SCORES) {
        	String team1 = game[0];
            String team2 = game[2];
        	strengthOfSchedule.put(team1, strengthOfSchedule.getOrDefault(team1, nextValuesPerTeam.getOrDefault(team1, 0.0)) + nextValuesPerTeam.getOrDefault(team2, 0.0));
        	strengthOfSchedule.put(team2, strengthOfSchedule.getOrDefault(team2, nextValuesPerTeam.getOrDefault(team2, 0.0)) + nextValuesPerTeam.getOrDefault(team1, 0.0));
        }
        for (String team : Data.FCS_TEAMS) {
        	strengthOfSchedule.remove(team);
        }
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double value : strengthOfSchedule.values()) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        for (String team : strengthOfSchedule.keySet()) {
            double value = strengthOfSchedule.get(team);
            value = (value - min) / (max - min);
            strengthOfSchedule.put(team, value);
        }
        
        ArrayList<Entry<String, Double>> sorted = new ArrayList<Entry<String,Double>>(nextValuesPerTeam.entrySet());
        ArrayList<Entry<String, Double>> sortedStrength = new ArrayList<Entry<String,Double>>(strengthOfSchedule.entrySet());
        Collections.sort(sorted, new Comparator<Entry<String, Double>>() {

            @Override
            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
                return (int)Math.signum(o2.getValue() - o1.getValue());
            }
        });
        Collections.sort(sortedStrength, new Comparator<Entry<String, Double>>() {

            @Override
            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
                return (int)Math.signum(o2.getValue() - o1.getValue());
            }
        });
        
        String date = new SimpleDateFormat("MMM dd, yyyy").format(new Date());
        System.out.println(String.format("\n## Current Rankings(%s):\n", date));
        for (int i = 0; i < sorted.size(); i++) {
            Entry<String, Double> team = sorted.get(i);
            if (!Data.FCS_TEAMS.contains(team.getKey())) {
            	int numWins = wins.getOrDefault(team.getKey(), 0);
            	int numLosses = losses.getOrDefault(team.getKey(), 0);
                System.out.println(String.format("%d", i + 1) +". " + team.getKey() + String.format(" (%d-%d): ", numWins, numLosses) + team.getValue());
            }
        }
        System.out.println("\n## Strength of Schedule\n");
        for (int i = 0; i < sortedStrength.size(); i++) {
            Entry<String, Double> team = sortedStrength.get(i);
            if (!Data.FCS_TEAMS.contains(team.getKey())) {
                System.out.println(String.format("%d", i + 1) +". " + team.getKey() + ": " + team.getValue());
            }
        }
    }
}
