package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HostGameMenu extends Menu implements ActionListener {

    private final JPanel hostGameMenu = new JPanel();

    HostGameMenu(GuiManager guiManager) {
        hostGameMenu.setBounds(0, 0, GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        hostGameMenu.setVisible(false);
        hostGameMenu.setBackground(new Color(150, 150, 150));
    }

    public JPanel getMenuPanel() { return hostGameMenu; }
    public void showMenu() {
        hostGameMenu.setVisible(true);
    }
    public void hideMenu() {
        hostGameMenu.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
