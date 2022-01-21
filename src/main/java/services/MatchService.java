package services;

import enums.WicketType;
import interfaces.Team;
import javafx.util.Pair;
import models.*;

import java.util.HashMap;
import java.util.List;

public class MatchService {
    static MatchService matchService = null;
    private HashMap<Match, ScoreBoard> matchScoreBoardHashMap;

    private MatchService() {}

    public static MatchService getInstance() {
        if (matchService == null) {
            matchService = new MatchService();
        }
        return matchService;
    }

    public Match createMatch(Team team1, Team team2) {
        Match match = new Match(team1, team2);
        ScoreBoard s = new ScoreBoard(match);
        this.matchScoreBoardHashMap.put(match, s);
        return match;
    }

    public ScoreBoard getScoreBoard(Match match) {
        return this.matchScoreBoardHashMap.get(match);
    }

    public Team getWinner(Match match) {
        Pair<Team, Team> p = match.getTeams();
        Integer team1Score = 0, team2Score = 0;
        ScoreBoard s = matchScoreBoardHashMap.get(match);
        HashMap<Player, PlayerInfo> team1scoreMap = s.getTeamHashMap(p.getKey());
        HashMap<Player, PlayerInfo> team2scoreMap = s.getTeamHashMap(p.getValue());
        for (PlayerInfo pi : team1scoreMap.values()){
            team2Score += pi.getRunsConceded();
        }
        for (PlayerInfo pi : team2scoreMap.values()){
            team1Score += pi.getRunsConceded();
        }
        return (team1Score > team2Score) ? p.getKey() : p.getValue();
    }

    public void addRuns(Match match, Player player, Player player1, int i) {
        ScoreBoard s = matchScoreBoardHashMap.get(match);
        Pair<Team, Team> p = match.getTeams();
        s.getTeamHashMap(p.getKey()).get(player).addRuns(i);
        s.getTeamHashMap(p.getKey()).get(player).addNoOfBallsFaced();
        s.getTeamHashMap(p.getKey()).get(player1).addDeliveries();
        s.getTeamHashMap(p.getKey()).get(player1).addRunsConceded(i);
    }

    public void extraBall(Match match, Player player, Player player1, int i) {
        ScoreBoard s = matchScoreBoardHashMap.get(match);
        Pair<Team, Team> p = match.getTeams();
        s.getTeamHashMap(p.getKey()).get(player).addRuns(i);
        s.getTeamHashMap(p.getKey()).get(player).addNoOfBallsFaced();
        s.getTeamHashMap(p.getKey()).get(player1).addRunsConceded(i);
    }

    public void gotOut(Match match, Player player, WicketType wicketType, List<Player> playerList) {
        ScoreBoard s = matchScoreBoardHashMap.get(match);
        Pair<Team, Team> p = match.getTeams();
        s.getTeamHashMap(p.getKey()).get(player).setGotOut();
        s.getTeamHashMap(p.getKey()).get(player).setWicketType(wicketType);
        s.getTeamHashMap(p.getKey()).get(player).setPlayersInvolvedInWicket(playerList);
    }
}