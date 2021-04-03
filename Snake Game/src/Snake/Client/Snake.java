package Snake.Client;

import Snake.Server.Player;

public class Snake extends Player {
    public enum COLOR {
        RED,
        BLUE,
        GREEN
    }
    private COLOR color = COLOR.RED;
    private final int START_SIZE = 4;
    private final int SPEED = 1;
    private int score = 0;
    private int length = 4;

    //methods
    private void spawn()
    {

    }

    private void turn()
    {

    }

    private void move()
    {

    }

    private void consumeDot()
    {

    }

    private void death()
    {

    }

    public COLOR getColor() {return color;}
    public int getLength() {return length;}

    public void setColor(COLOR color)
    {
        this.color = color;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
}
