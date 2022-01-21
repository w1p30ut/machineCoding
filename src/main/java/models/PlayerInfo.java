package models;

import enums.WicketType;

import java.util.ArrayList;
import java.util.List;

public class PlayerInfo {
    private Player player;
    private Integer runsScored;
    private Integer noOfBallsFaced;
    private Integer noOfFours;
    private Integer noOfSixes;
    private Integer deliveriesBowled;
    private Integer runsConceded;
    private Integer wicketsTaken;
    private boolean gotOut;
    private WicketType wicketType;
    private List<Player> playersInvolvedInWicket;

    public PlayerInfo(Player player)
    {
        this.player = player;
        this.runsScored = 0;
        this.noOfBallsFaced = 0;
        this.noOfFours = 0;
        this.noOfSixes = 0;
        this.deliveriesBowled = 0;
        this.runsConceded = 0;
        this.wicketsTaken = 0;
        this.gotOut = false;
        this.wicketType = null;
        this.playersInvolvedInWicket = new ArrayList<>();
    }

    public Integer getRunsConceded() {
        return runsConceded;
    }
    public Integer getNoOfBallsFaced() {return noOfBallsFaced;}

    public Integer getRunsScored() {
        return runsScored;
    }

    public Integer getNoOfFours() {
        return noOfFours;
    }

    public Integer getNoOfSixes() {
        return noOfSixes;
    }

    public Integer getDeliveriesBowled() {
        return deliveriesBowled;
    }

    public Integer getWicketsTaken() {
        return wicketsTaken;
    }

    public boolean isGotOut() {
        return gotOut;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public List<Player> getPlayersInvolvedInWicket() {
        return playersInvolvedInWicket;
    }

    public void addRuns(int i) {
        this.runsScored += i;
    }

    public void addDeliveries() {
        this.deliveriesBowled += 1;
    }

    public void addNoOfBallsFaced() {
        this.noOfBallsFaced += 1;
    }

    public void addRunsConceded(int i) {
        this.runsConceded += i;
    }

    public void setGotOut() {
        this.gotOut = true;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }

    public void setPlayersInvolvedInWicket(List<Player> playersInvolvedInWicket) {
        this.playersInvolvedInWicket = playersInvolvedInWicket;
    }
}