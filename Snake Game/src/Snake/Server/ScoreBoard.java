package Snake.Server;

import Snake.Client.Client;

import java.util.ArrayList;

public class ScoreBoard {
    ArrayList<Player> players;

    ScoreBoard(ArrayList<Player> players) {
        this.players = players;
    }

    private void updateScores()
    {

    }

    private void resetScores()
    {
        players.get(0).setScore(0);
        players.get(1).setScore(0);
    }

    private Player getHighestScore() {
        if (players.get(0).getScore() > players.get(1).getScore()) {
            return players.get(0);
        }
        else if (players.get(0).getScore() < players.get(1).getScore()) {
            return players.get(1);
        }
        else {
            return null;
        }
    }

    private void sortPlayerByScore() {
        ArrayList<Player> playersCopy = players;
        if (players.get(0).getScore() < players.get(1).getScore()) {
            players.clear();
            players.add(playersCopy.get(1));
            players.add(playersCopy.get(0));
        }
    }
}
