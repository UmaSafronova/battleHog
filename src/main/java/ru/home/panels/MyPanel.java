package ru.home.panels;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Image fon = new ImageIcon("src/fon.png").getImage();
        g2d.drawImage(fon, 0, 0, 600, 600, null);
        g2d.setColor(Color.orange);
        g2d.fillRect(590, 0, 10, 600);
        g2d.fillRect(0, 0, 600, 10);
        g2d.fillRect(0, 0, 10, 600);
        g2d.fillRect(0, 590, 600, 10);

        for (int i = 0; i <= Main.m - 1; i++){
            g2d.fillRect(Main.A[i][0], Main.A[i][1], Main.A[i][2], Main.h);
            //вот сюда надо вставить картинку
        }
        g2d.setColor(Color.magenta);
        Image hedgehog = new ImageIcon("src/ёжик.png").getImage();
        g2d.drawImage(hedgehog, Main.x1, Main.y1, 2 * Main.r1,2 * Main.r1, null);
        g2d.drawImage(hedgehog, Main.x2, Main.y2, 2 * Main.r2,2 * Main.r2, null);
        String inscription = Main.strscore + " " + Main.score1 + ":" + Main.score2;
        g2d.setColor(Color.black);
        g2d.drawString(inscription, 50, 50);
    }
}
