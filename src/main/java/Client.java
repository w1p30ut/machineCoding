import enums.WicketType;
import interfaces.Team;
import models.*;
import services.*;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        MatchService matchService = MatchService.getInstance();
        Team indiaTeam = new IndiaTeam();
        Team australiaTeam = new AustraliaTeam();
        List<Player> indianPlayers =  indiaTeam.getPlayingXI();
        List<Player> australianPlayers = australiaTeam.getPlayingXI();

        Match match = matchService.createMatch(indiaTeam, australiaTeam);
        System.out.println(match.toString());
        ScoreBoard scoreBoard = matchService.getScoreBoard(match);

        matchService.addRuns(match, indianPlayers.get(0), australianPlayers.get(10), 4);
        matchService.extraBall(match, indianPlayers.get(0), australianPlayers.get(9), 2);
        matchService.gotOut(match, indianPlayers.get(1), WicketType.BOWLED_OUT, Arrays.asList(australianPlayers.get(8)));
        matchService.gotOut(match, indianPlayers.get(0), WicketType.RUN_OUT, Arrays.asList(australianPlayers.get(9), australianPlayers.get(2)));
        ScoreBoardService.showScoreBoard(scoreBoard);
        matchService.getWinner(match);
    }
}