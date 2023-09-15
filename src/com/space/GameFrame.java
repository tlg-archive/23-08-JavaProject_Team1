package com.space;

import javax.swing.*;
import java.awt.*;

public class GameFrame {

    GamePanel panel;

    public GameFrame() {
        JFrame frame = new JFrame();
        panel = new GamePanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Asteroids");
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
        frame.pack();

    }

    public void startGame() {
        panel.startGame();
    }


}