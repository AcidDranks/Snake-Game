package Snake;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameManager extends JPanel implements ActionListener {

    static final int WINDOW_HEIGHT = 900;
    static final int WINDOW_WIDTH = 1600;

    static final int CUBE_SIZE = 20;

    private ScoreBoard scoreBoard = new ScoreBoard();
    private Map map = new Map();

    private double gameTime = 0;

    GameManager(){

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
