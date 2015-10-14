package io.github.mac_genius.pong;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mac on 10/12/2015.
 */
public class Main {
    public static void main(String[] args) {
        JFrame main = new JFrame("Pong");
        main.setMinimumSize(new Dimension(800, 500));
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
