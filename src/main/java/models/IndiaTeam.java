package models;

import enums.PlayerType;
import interfaces.Team;

import java.util.ArrayList;
import java.util.List;

public class IndiaTeam extends Team {
    
    public IndiaTeam()
    {
        this.teamName = "India";
        List<Player> indianPlayers = new ArrayList<>();
        indianPlayers.add(new Player("Rohit Sharma", PlayerType.BATSMAN));
        indianPlayers.add(new Player("Virat Kohli", PlayerType.BATSMAN));
        indianPlayers.add(new Player("Rishabh Pant", PlayerType.BATSMAN));
        indianPlayers.add(new Player("KL Rahul", PlayerType.BATSMAN));
        indianPlayers.add(new Player("Suryakumar Yadav", PlayerType.BATSMAN));
        indianPlayers.add(new Player("Shreyas Iyer", PlayerType.BATSMAN));
        indianPlayers.add(new Player("Shardul Thakur", PlayerType.ALLOUNDER));
        indianPlayers.add(new Player("Ravichandran Ashwin", PlayerType.ALLOUNDER));
        indianPlayers.add(new Player("Mohd Siraj", PlayerType.BOWLER));
        indianPlayers.add(new Player("Mohd Shami", PlayerType.BOWLER));
        indianPlayers.add(new Player("Jasprit Bumrah", PlayerType.BOWLER));
        
        playingXI = indianPlayers;
    }
    @Override
    public List<Player> getPlayingXI() {
        return playingXI;
    }
}
