package Snake.Server;
import Snake.Client.Snake;
import Snake.Common.Map;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameManager extends JPanel implements ActionListener {

    public static final int WINDOW_HEIGHT = 900;
    public static final int WINDOW_WIDTH = 1600;

    public ArrayList<Player> players;

    static final int CUBE_SIZE = 20;

    private ScoreBoard scoreBoard = new ScoreBoard(players);
    private Map map = new Map();

    private double gameTime = 0;

    public GameManager(){

    }

    public void startMatch(){

    }

    public void paintComponent(Graphics graphics){

    }

    public void draw(Graphics graphics){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    //methods
    private void updatePlayerPositions()
    {

    }

    private void killSnake(Snake snake)
    {

    }

    private void checkPlayerPositions()
    {

    }

    private void startGame()
    {

    }

    private void endGame()
    {

    }
}
