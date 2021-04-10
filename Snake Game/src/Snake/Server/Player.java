package Snake.Server;

import Snake.Client.Client;
import Snake.Client.Snake;

public class Player extends Client {
    private Snake snake = new Snake();
    private int score = 0;

    //methods
    public void controlSnake()
    {

    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() { return score; }

    public Snake getSnake() { return snake; }
}
