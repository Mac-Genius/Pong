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
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton singlePlayer = new JButton("Play");
        singlePlayer.setFont(new Font("Play", Font.PLAIN, 48));
        singlePlayer.setForeground(new Color(255, 255, 255));
        singlePlayer.setBackground(new Color(0, 0, 0));
        singlePlayer.setBorderPainted(false);
        singlePlayer.setFocusPainted(false);
        singlePlayer.setPreferredSize(new Dimension(330, 60));
        singlePlayer.setActionCommand("start");
        singlePlayer.addActionListener(this);

        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(20, 40, 20, 40);
        c.gridx = 0;
        c.gridy = 0;
        this.add(singlePlayer, c);

        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Exit", Font.PLAIN, 48));
        exit.setPreferredSize(new Dimension(200, 20));
        exit.setForeground(new Color(255, 255, 255));
        exit.setBackground(new Color(0, 0, 0));
        exit.setBorderPainted(false);
        exit.setFocusPainted(false);
        exit.setPreferredSize(new Dimension(330, 60));
        exit.setActionCommand("exit");
        exit.addActionListener(this);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        this.add(exit, c);

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
