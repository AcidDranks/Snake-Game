package Snake;
import javax.swing.*;

public class GuiManager {

    //declare vars
    private final JFrame mainWindow = new JFrame();
    private final MainMenu mainMenu = new MainMenu(this);
    private final HostGameMenu hostGameMenu = new HostGameMenu(this);
    //private final JoinGameMenu joinGameMenu = new HostGameMenu(this);

    //Constants
    static final int BUTTON_WIDTH = 200;
    static final int BUTTON_HEIGHT = 50;

    //Global Components

    GuiManager() {

        //create window
        mainWindow.setTitle("MP Snake");
        mainWindow.setSize(GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.setLayout(null);

        //add components
        mainWindow.add(mainMenu.getMainMenuPanel());
    }

    public JFrame getMainWindow() { return mainWindow; }
    public MainMenu getMainMenu() { return mainMenu; }
    public HostGameMenu getHostGameMenu() { return hostGameMenu; }
}
