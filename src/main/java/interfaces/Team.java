package interfaces;

import models.Player;

import java.util.List;

public abstract class Team {
    protected String teamName;
    protected List<Player> playingXI = null;
    public abstract List<Player> getPlayingXI();
    public String getTeamName() {return teamName;}
}