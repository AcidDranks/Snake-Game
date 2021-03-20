package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainMenu extends Menu implements ActionListener {

    //declare variables
    private final GuiManager guiManager;
    private final JPanel mainMenuPanel = new JPanel();
    private final JButton hostGameBtn = new JButton();
    private final JButton joinGameBtn = new JButton();
    private final JButton exitBtn = new JButton();

    MainMenu(GuiManager guiManager) {

        this.guiManager = guiManager;

        //this menu
        mainMenuPanel.setBounds(0, 0, GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        mainMenuPanel.setVisible(true);
        mainMenuPanel.setBackground(new Color(150, 150, 150));
        mainMenuPanel.setLayout(null);

        //add components
        JLabel title = new JLabel();
        mainMenuPanel.add(title);
        mainMenuPanel.add(hostGameBtn);
        mainMenuPanel.add(joinGameBtn);
        mainMenuPanel.add(exitBtn);

        //title
        title.setText("MP Snake");
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.CENTER);
        title.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2 - 50, 175, 350, 50);
        title.setFont(new Font("TimesNewRoman", Font.BOLD, 64));
        title.setVisible(true);

        //host button
        hostGameBtn.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2, 375, GuiManager.BUTTON_WIDTH, GuiManager.BUTTON_HEIGHT);
        hostGameBtn.setText("Host Game");
        hostGameBtn.setFocusable(false);
        hostGameBtn.addActionListener(this);

        //join button
        joinGameBtn.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2, hostGameBtn.getY() + 100, GuiManager.BUTTON_WIDTH, GuiManager.BUTTON_HEIGHT);
        joinGameBtn.setText("Join Game");
        joinGameBtn.setFocusable(false);
        joinGameBtn.addActionListener(this);

        //exit button
        exitBtn.setBounds(GameManager.WINDOW_WIDTH / 2 - GuiManager.BUTTON_WIDTH / 2, 700, GuiManager.BUTTON_WIDTH, GuiManager.BUTTON_HEIGHT);
        exitBtn.setText("Exit");
        exitBtn.setFocusable(false);
        exitBtn.addActionListener(this);
    }

    //Methods
    @Override
    public JPanel getMenuPanel() { return mainMenuPanel; }
    @Override
    public void showMenu() { mainMenuPanel.setVisible(true); }
    @Override
    public void hideMenu() { mainMenuPanel.setVisible(false); }

    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hostGameBtn) {
            hideMenu();
            guiManager.getHostGameMenu().showMenu();
        }
        else if (e.getSource() == joinGameBtn) {
            hideMenu();
            guiManager.getJoinGameMenu().showMenu();
        }
        else if (e.getSource() == exitBtn) {
            guiManager.getMainWindow().dispose();
        }
    }
}
