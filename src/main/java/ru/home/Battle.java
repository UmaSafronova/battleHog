package ru.home;

import ru.home.model.BattleGround;
import ru.home.panels.MyPanel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Battle {
    static int[][] blocksArray = {{0, 590, 600}, {160, 560, 70}, {210, 540, 70}, {270, 505, 70}, {190, 480, 70}, {150, 460, 70}, {350, 520, 70},
            {420, 490, 70}};
    static int[][] hedgehogArray = {{500, 580, 5, 0, 0}, {200, 580, 5, 0, 0}};
//    static int x2 = 200, y2 = 580, r2 = 10, vx2 = 0, vy2 = 0;
//    static int xPosition = 500, yPosition = 580, radius = 10, xSpeed = 0, ySpeed = 0;
//    static int scoreFirstHog = 0;
//    static int scoreSecondHog = 0;
    static int already_credited1 = 0;//разобраться, что ето такое
    static int already_credited2 = 0; //разобраться, что ето такое


    static Audio jump = new Audio("src/cartoon-spring-boing-01.WAV", 0.68);
//    static String[] UP = {"VK_UP", "VK_W"};
//    static String[] R = {"VK_RIGHT", "VK_D"};
//    static String[] L = {"VK_LEFT", "VK_A"};
//    static int m = blocksArray.length;
//    static int n = hedgehogArray.length;
//    static int h = 10;
//    static int g = 1;
    static String strscore = "Score";
    static String strscore1 = Integer.toString(scoreFirstHog);
    static String strscore2 = Integer.toString(scoreSecondHog);

    public static int f1(int i){
        int x0, y0, l0;
        x0 = blocksArray[i][0];
        y0 = blocksArray[i][1];
        l0 = blocksArray[i][2];
        if (xPosition + radius >= x0 && xPosition + radius <= x0 + l0){
            if (yPosition + 2 * radius >= y0 && yPosition <= y0){
                return 1; //сверху соприкасается
            }
            if (yPosition <= y0 + h && yPosition + 2 * radius >= y0 - h){
                return 2; //снизу соприкасается
            }
        }
        return 0; //не соприкасается
    }

    public static int f2(int i){
        int x0, y0, l0;
        x0 = blocksArray[i][0];
        y0 = blocksArray[i][1];
        l0 = blocksArray[i][2];
        if (x2 + r2 >= x0 && x2 + r2 <= x0 + l0){
            if (y2 + 2 * r2 >= y0 && y2 <= y0){
                return 1; //сверху соприкасается
            }
            if (y2 <= y0 + h && y2 + 2 * r2 >= y0 - h){
                return 2; //снизу соприкасается
            }
        }
        return 0; //не соприкасается
    }

    public static int g1() { //падает первый
        int x0, y0, l0;
        x0 = x2;
        y0 = y2;
        l0 = 2 * r2;
        if (xPosition + radius >= x0 && xPosition + radius <= x0 + l0 &&  < 0) {
            if (yPosition <= y0 + 2 * r2 && yPosition + 2 * radius >= y0 - 2 * r2) {
                return 1;
            }
        }
        return 0;
    }

    public static int g2() { //падает второй
        int x0, y0, l0;
        x0 = xPositionBlock;
        y0 = yPositionHog;
        l0 = 2 * radius;
        if (x2 + r2 >= x0 && x2 + r2 <= x0 + l0 && vy2 < 0) {
            if (y2 <= y0 + 2 * radius && y2 + 2 * r2 >= y0 - 2 * radius) {
                return 1;
            }
        }
        return 0;
    }

    static Timer timer;

    public static void startBattle() {
        BattleGround.start();


//        JFrame window = new JFrame("Super-puper gaaaame");
//        window.setSize(400, 600);
//        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        MyPanel panel = new MyPanel();
//
//        panel.setFocusable(true);
//        panel.addKeyListener(new KeyListener());
//
//        window.add(panel);
//        window.setVisible(true);
//
//
//        ActionListener listener = new JComboBox<>();
//
//        timer = new Timer(1, listener);
//        timer.start();

    }
}
