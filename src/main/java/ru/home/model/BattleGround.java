package ru.home.model;

import ru.home.PropertiesProvider;
import ru.home.panels.ActionImpl;
import ru.home.panels.MyPanel;

import javax.swing.*;
import java.awt.event.KeyListener;

public class BattleGround {
    private int width;
    private int height;
    private static int countBlocks;
    private static int countHog;
    private static int gravity;

    static Timer timer;

    private int[][] arrayBlocksInt = {{0, 590, 600}, {160, 560, 70}, {210, 540, 70}, {270, 505, 70}, {190, 480, 70}, {150, 460, 70}, {350, 520, 70}, {420, 490, 70}};
    static int[][] arrayHogsInt = {{500, 580, 9}, {200, 580, 5}};
    private Block[] blocks = new Block[countBlocks];
    private Hedgehog[] hogs = new Hedgehog[countHog];


    public BattleGround() {
        this.width = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.weight"));
        this.height = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.height"));
        this.countBlocks = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.countBlocks"));
        this.countHog = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.countHog"));
        this.gravity = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.gravity"));
        this.blocks = createArrayBlocks(countBlocks);
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getCountBlocks() {
        return countBlocks;
    }
    public void setCountBlocks(int countBlocks) {
        this.countBlocks = countBlocks;
    }
    public int getCountHog() {
        return countHog;
    }
    public void setCountHog(int countHog) {
        this.countHog = countHog;
    }
    public int getGravity() {
        return gravity;
    }
    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    private Block[] createArrayBlocks(int countBlocks) { //пока countBlocks нужен для идеалогии, но данные уже введены
        Block[] arrayBlocks = new Block[countBlocks];
        for (int i = 0; i <= countBlocks - 1; i++){
            arrayBlocks[i] = new Block(arrayBlocksInt[i][0], arrayBlocksInt[i][1], arrayBlocksInt[i][2]);
        }
        return arrayBlocks;
    }

    private Hedgehog[] createArrayHogs(int countHog) { //аналогично нужен только формально
        Hedgehog[] arrayHogs = new Hedgehog[countHog];
        for (int i = 0; i <= countBlocks - 1; i++){
            arrayHogs[i] = new Hedgehog(i, arrayHogsInt[i][0], arrayHogsInt[i][1], arrayHogsInt[i][2]);
        }
        return arrayHogs;
    }



    public static void start(){

        JFrame window = new JFrame("Super-puper gaaaame");
        window.setSize(400, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        panel.setFocusable(true);
        panel.addKeyListener(new ActionImpl());
        window.add(panel);
        window.setVisible(true);

        BattleGround battleGround = new BattleGround();
        battleGround.setCountBlocks(7);
        battleGround.setCountHog(2);
        battleGround.setHeight(600);
        battleGround.setWidth(600);
        battleGround.setGravity(1);


    }
}

