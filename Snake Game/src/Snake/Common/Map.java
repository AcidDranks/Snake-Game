package Snake.Common;

import Snake.Server.GameManager;

import javax.swing.*;
import java.awt.*;

public class Map {
    private int[] mapSize = {64,64};

    private JPanel mapPanel = new JPanel();
    private Dot dot = new Dot();

    public Map() {
        Dot.respawn();

        //this menu
        mapPanel.setBounds(0, 0, GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        mapPanel.setVisible(true);
        mapPanel.setBackground(new Color(150, 150, 150));
        mapPanel.setLayout(null);

        //add components

    }

    // methods

    // get or set mapSize
    public int[] getMapSize() { return mapSize; }
    public void setMapSize(int x,int y)
    {
        mapSize[0] = x;
        mapSize[1] = y;
    }

    // get or set mapPanel
    public JPanel getMapPanel() { return mapPanel; }
    public void setMapPanel(JPanel mapPanel) { this.mapPanel = mapPanel; }
}
