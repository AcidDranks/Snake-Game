package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HostGameMenu implements ActionListener {

    private final JPanel hostGameMenu = new JPanel();

    HostGameMenu(GuiManager guiManager) {
        hostGameMenu.setBounds(0, 0, GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        hostGameMenu.setVisible(false);
        hostGameMenu.setBackground(new Color(150, 150, 150));
    }

    public void showHostMenu() {
        hostGameMenu.setVisible(true);
    }
    public void hideHostMenu() {
        hostGameMenu.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
