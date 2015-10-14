package io.github.mac_genius.pong;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mac on 10/12/2015.
 */
public class Main {
    public static void main(String[] args) {
        JFrame main = new JFrame("Pong");
        JPanel background = new JPanel(new GridBagLayout());
        background.setBackground(new Color(0, 0, 0));
        background.setPreferredSize(new Dimension(800, 500));
        MainMenu menu = new MainMenu();
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setContentPane(background);
        main.add(menu);

        main.pack();
        main.setVisible(true);
    }
}
