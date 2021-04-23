package Snake.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public abstract class Motion extends JPanel implements ActionListener, KeyListener {
    Timer time = new Timer(5, this);
    double posX = 0, posY = 0, veloX = 0, veloY = 0;

    public Motion() {
        time.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);  // stuff like tab etc
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Rectangle2D.Double(100, 100, 40, 40)); // CHANGE X AND Y SPAWN (SNAKE SPAWN)
    }

    /*
        The speed at which the block moves around change numbers here if needed
     */
    public void actionPerformed(ActionEvent e) {
        repaint();
        posX += veloX;
        posY += veloY;
    }
    public void up() {
        veloY = -1.5;
        veloX = 0;
    }
    public void down() {
        veloY = 1.5;
        veloX = 0;
    }
    public void left() {
        veloX = -1.5;
        veloY = 0;
    }
    public void right() {
        veloX = 1.5;
        veloY = 0;
    }
    /*
        Only arrow keys right now if we want we can make it AWSD
     */

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            up();
        }
        if (code == KeyEvent.VK_DOWN) {
            down();
        }
        if (code == KeyEvent.VK_LEFT) {
            left();
        }
        if (code == KeyEvent.VK_RIGHT) {
            right();
        }
        // to make it not toggle i believe but this is snake
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}