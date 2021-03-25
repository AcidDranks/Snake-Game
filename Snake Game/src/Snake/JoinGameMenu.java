package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinGameMenu extends Menu implements ActionListener {

    //declare variables
    private final GuiManager guiManager;
    private final JPanel joinMenuPanel = new JPanel();
    private final JButton backBtn = new JButton();

    JoinGameMenu(GuiManager guiManager) {
        this.guiManager = guiManager;

        //this menu
        joinMenuPanel.setBounds(0, 0, GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        joinMenuPanel.setVisible(false);
        joinMenuPanel.setBackground(new Color(150, 150, 150));
        joinMenuPanel.setLayout(null);

        //add components
        JLabel title = new JLabel();
        joinMenuPanel.add(title);
        joinMenuPanel.add(backBtn);

        //title
        title.setText("MP Snake");
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.CENTER);
        title.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2 - 50, 175, 350, 50);
        title.setFont(new Font("TimesNewRoman", Font.BOLD, 64));
        title.setVisible(true);

        //back button
        backBtn.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2, 700, GuiManager.BUTTON_WIDTH, GuiManager.BUTTON_HEIGHT);
        backBtn.setText("Back");
        backBtn.setFocusable(false);
        backBtn.addActionListener(this);
    }

    //methods
    @Override
    public JPanel getMenuPanel() { return joinMenuPanel; }
    @Override
    public void showMenu() { joinMenuPanel.setVisible(true); }
    @Override
    public void hideMenu() { joinMenuPanel.setVisible(false); }

    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn) {
            hideMenu();
            guiManager.getMainMenu().showMenu();
        }
    }
}
