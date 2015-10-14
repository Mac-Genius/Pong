package io.github.mac_genius.pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mac on 10/12/2015.
 */
public class MainMenu extends JPanel implements ActionListener {

    public MainMenu() {
        //setLayout(new GridBagLayout());
        JButton singlePlayer = new JButton("Single Player");
        singlePlayer.setFont(new Font("Single Player", Font.PLAIN, 48));
        singlePlayer.setForeground(new Color(255, 255, 255));
        singlePlayer.setBackground(new Color(0, 0, 0));
        singlePlayer.setBorderPainted(false);
        singlePlayer.setFocusPainted(false);
        singlePlayer.setPreferredSize(new Dimension(330, 60));
        singlePlayer.setActionCommand("start");

        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Exit", Font.PLAIN, 48));
        exit.setPreferredSize(new Dimension(200, 20));
        exit.setForeground(new Color(255, 255, 255));
        exit.setBackground(new Color(0, 0, 0));
        exit.setBorderPainted(false);
        exit.setFocusPainted(false);
        exit.setPreferredSize(new Dimension(330, 60));
        exit.setActionCommand("exit");

        singlePlayer.addActionListener(this);
        exit.addActionListener(this);

        this.add(singlePlayer);
        this.add(exit);
        this.setBackground(new Color(0, 0, 0));
        this.setPreferredSize(new Dimension(340, 200));
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("exit")) {
            System.out.println("Exiting the game...");
            System.exit(0);
        }
    }
}
