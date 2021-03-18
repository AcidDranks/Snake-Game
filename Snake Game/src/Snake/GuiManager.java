package Snake;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiManager extends JFrame implements ActionListener{

    static final int BUTTON_WIDTH = 200;
    static final int BUTTON_HEIGHT = 50;

    private JButton hostGameBtn = new JButton();
    private JButton joinGameBtn = new JButton();
    private JButton exitBtn = new JButton();
    private JFrame mainMenu = new JFrame();
    private JFrame map = new JFrame();
    private Label title = new Label();

    GuiManager() {

        //title
        title.setText("MP Snake");
        title.setBounds(GameManager.WINDOW_WIDTH/2 - BUTTON_WIDTH/2, 200, BUTTON_WIDTH,BUTTON_HEIGHT);
        title.setVisible(true);

        //host button
        hostGameBtn.setBounds(GameManager.WINDOW_WIDTH/2 - BUTTON_WIDTH/2, 300, BUTTON_WIDTH,BUTTON_HEIGHT);
        hostGameBtn.setText("Host Game");
        hostGameBtn.setFocusable(false);

        //join button
        joinGameBtn.setBounds(GameManager.WINDOW_WIDTH/2 - BUTTON_WIDTH/2, 400, BUTTON_WIDTH,BUTTON_HEIGHT);
        joinGameBtn.setText("Join Game");
        joinGameBtn.setFocusable(false);

        //exit button
        exitBtn.setBounds(GameManager.WINDOW_WIDTH/2 - BUTTON_WIDTH/2, 700, BUTTON_WIDTH,BUTTON_HEIGHT);
        exitBtn.setText("Exit");
        exitBtn.setFocusable(false);

        //create menu
        mainMenu.setTitle("MP Snake");
        mainMenu.setSize(GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setVisible(true);
        mainMenu.setLayout(null);
        mainMenu.setForeground(Color.DARK_GRAY);

        //add buttons
        mainMenu.add(hostGameBtn);
        mainMenu.add(joinGameBtn);
        mainMenu.add(exitBtn);

        //create map
        map.setSize(GameManager.WINDOW_WIDTH, GameManager.WINDOW_HEIGHT);
        map.setResizable(false);
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        map.setVisible(false);
        map.setLayout(null);
    }

    public void showMap() {
        map.setVisible(true);
    }

    public void showMainMenu()
    {
        mainMenu.setVisible(true);
    }

    //FIX ME
    //button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hostGameBtn) {
            System.out.println("here");
        }
        else if (e.getSource() == joinGameBtn) {
            System.out.println("here2");
        }
        else if (e.getSource() == exitBtn) {
            mainMenu.dispose();
        }
    }
}
