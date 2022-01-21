package services;

public class PlayerService {
    private PlayerService playerService = null;

    public PlayerService() {}

    public PlayerService getInstance()
    {
        if(playerService == null)
        {
            playerService = new PlayerService();
        }
        return playerService;
    }
}
