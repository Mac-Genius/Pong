package io.github.mac_genius.pong;

import javax.swing.*;
import java.awt.*;

/**
 * This is the driver class for the game. This initializes the main
 * window and sets up the content page.
 *
 * @author John Harrison
 */

public class Main {

    /**
     * This is the main class where the setup takes place.
     *
     * @param args - command line arguments
     */

    public static void main(String[] args) {

        // The actual frame
        JFrame main = new JFrame("Pong");
        main.setMinimumSize(new Dimension(800, 500));

        // The content panel
        JPanel background = new JPanel(new GridBagLayout());
        background.setBackground(new Color(0, 0, 0));
        background.setPreferredSize(new Dimension(800, 500));
        MainMenu menu = new MainMenu();
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(100, 150, 100, 150);
        c.weightx = .5;
        c.weighty = .5;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;

        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setContentPane(background);
        main.add(menu, c);

        main.pack();
        main.setVisible(true);
    }
}
