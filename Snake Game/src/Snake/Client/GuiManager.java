package Snake.Client;
import Snake.Server.GameManager;

import javax.swing.*;

public class GuiManager {

    //declare vars
    private final JFrame mainWindow = new JFrame();
    private final MainMenu mainMenu = new MainMenu(this);
    private final HostGameMenu hostGameMenu = new HostGameMenu(this);
    private final JoinGameMenu joinGameMenu = new JoinGameMenu(this);

    //Constants
    static final int BUTTON_WIDTH = 200;
    static final int BUTTON_HEIGHT = 50;

    //Global Components

    public GuiManager() {

        //create window
        mainWindow.setTitle("MP Snake");
        mainWindow.setSize(GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.setLayout(null);

        //add components
        mainWindow.add(mainMenu.getMenuPanel());
        mainWindow.add(hostGameMenu.getMenuPanel());
        mainWindow.add(joinGameMenu.getMenuPanel());
    }

    public JFrame getMainWindow() { return mainWindow; }
    public MainMenu getMainMenu() { return mainMenu; }
    public HostGameMenu getHostGameMenu() { return hostGameMenu; }
    public JoinGameMenu getJoinGameMenu() { return joinGameMenu; }
}
