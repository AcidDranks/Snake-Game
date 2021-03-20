package Snake;

import javax.swing.*;

public abstract class Menu {

    private GuiManager guiManager;
    private JPanel panel;

    Menu() {

    }

    Menu(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    //Methods
    public abstract JPanel getMenuPanel();
    public abstract void showMenu();
    public abstract void hideMenu();
}
