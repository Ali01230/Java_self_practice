package OOP.constructor_encapsulation;

public class FootballPlayers {
    private String name;
    private int playerNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    FootballPlayers(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }
}

