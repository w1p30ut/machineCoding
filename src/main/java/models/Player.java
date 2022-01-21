package models;

import enums.PlayerType;

import java.util.UUID;

public class Player {
    private String id;
    private String name;
    private PlayerType playerType;

    public Player(String name, PlayerType playerType) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }
}