package models;

import interfaces.Team;
import javafx.util.Pair;

import java.util.HashMap;

public class ScoreBoard {
    private Match match;
    private HashMap<Team, HashMap<Player, PlayerInfo>> teamHashMap;
    public ScoreBoard(Match match)
    {
        this.match = match;
        Pair<Team, Team> p = match.getTeams();
        this.teamHashMap = new HashMap<>();
        HashMap<Player, PlayerInfo> tempHash = new HashMap<>();
        for (Player x: p.getKey().getPlayingXI())
        {
            tempHash.put(x, new PlayerInfo(x));
        }
        this.teamHashMap.put(p.getKey(), tempHash);
        for (Player x: p.getValue().getPlayingXI())
        {
            tempHash.put(x, new PlayerInfo(x));
        }
        this.teamHashMap.put(p.getValue(), tempHash);
    }

    public HashMap<Player, PlayerInfo> getTeamHashMap(Team t1) {
        return teamHashMap.get(t1);
    }

    public void showScoreBoard()
    {
        for (Team t: teamHashMap.keySet())
        {
            System.out.print("Scores for team " + t.getTeamName() + " are as below:");
            for(Player p: teamHashMap.get(t).keySet())
            {
                PlayerInfo pinfo = teamHashMap.get(t).get(p);
                StringBuilder s = new StringBuilder();
                if(pinfo.getNoOfBallsFaced() > 0)
                {
                    s.append(p.getName() + " has scored " + pinfo.getRunsScored() + " in which there are "
                            + pinfo.getNoOfFours() + " fours and " + pinfo.getNoOfSixes() + " sixes");
                }
                if(pinfo.isGotOut())
                {
                    s.append(p.getName() + " got out by " + pinfo.getWicketType() + " in which these " +
                            "players were involved " + pinfo.getPlayersInvolvedInWicket().toString());
                }
                if(pinfo.getDeliveriesBowled() > 0)
                {
                    s.append(p.getName() + " has bowled " + (float)pinfo.getDeliveriesBowled()/6 + " overs and  taken "
                            + pinfo.getWicketsTaken() + " wickets and conceded " + pinfo.getRunsConceded() + " runs");
                }
            }
        }
    }
}