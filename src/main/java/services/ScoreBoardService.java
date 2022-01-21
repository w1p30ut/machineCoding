package services;

import models.Match;
import models.ScoreBoard;

import java.util.HashMap;

public class ScoreBoardService {
    private Match match;
    private HashMap<Match, ScoreBoard> matchScoreBoardHashMap;
    public ScoreBoardService(Match match)
    {
        this.match = match;
        ScoreBoard s = new ScoreBoard(match);
        this.matchScoreBoardHashMap = new HashMap<>();
        this.matchScoreBoardHashMap.put(match, s);
    }


    public static void showScoreBoard(ScoreBoard scoreBoard)
    {
        scoreBoard.showScoreBoard();
    }
}