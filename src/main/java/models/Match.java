package models;

import interfaces.Team;
import javafx.util.Pair;

public class Match {
    private Team t1;
    private Team t2;
    private ScoreBoard scoreBoard;

    public Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
        scoreBoard = new ScoreBoard(this);
    }

    public Pair<Team, Team> getTeams()
    {
        return new Pair<>(this.t1, this.t2);
    }
    public String toString()
    {
        System.out.println(t1.getTeamName() + " " + t2.getTeamName());
        return t1.getTeamName() + " " + t2.getTeamName();
    }
}
