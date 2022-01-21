package models;

import enums.PlayerType;
import interfaces.Team;

import java.util.ArrayList;
import java.util.List;

public class AustraliaTeam extends Team {

    public AustraliaTeam()
    {
        this.teamName = "Australia";
        List<Player> australianPlayers = new ArrayList<>();
        australianPlayers.add(new Player("David Warner", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Marnus Labuschagne", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Steven Smith", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Travis Head", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Alex Carey", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Usman Khwaja", PlayerType.BATSMAN));
        australianPlayers.add(new Player("Pat Cummins", PlayerType.ALLOUNDER));
        australianPlayers.add(new Player("Cameron Green", PlayerType.ALLOUNDER));
        australianPlayers.add(new Player("Nathan Lyon", PlayerType.BOWLER));
        australianPlayers.add(new Player("Mitchell Starc", PlayerType.BOWLER));
        australianPlayers.add(new Player("Scott Boland", PlayerType.BOWLER));

        playingXI = australianPlayers;
    }
    @Override
    public List<Player> getPlayingXI() {
        return playingXI;
    }
}
