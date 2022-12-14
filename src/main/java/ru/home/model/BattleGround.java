package ru.home.model;

import ru.home.PropertiesProvider;

public class BattleGround {
    private int width;
    private int height;
    private int countBlocks;
    private int countHog;
    private int gravity;
    private int[][] arrayBlocksInt = {{0, 590, 600}, {160, 560, 70}, {210, 540, 70}, {270, 505, 70}, {190, 480, 70}, {150, 460, 70}, {350, 520, 70}, {420, 490, 70}};
    private int[][] arrayHogsInt = {{500, 580, 5}, {200, 580, 5}};

    public BattleGround() {
        this.width = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.weight"));
        this.height = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.height"));
        this.countBlocks = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.countBlocks"));
        this.countHog = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.countHog"));
        this.gravity = Integer.parseInt(PropertiesProvider.getAppProperties().getProperty("battleGround.gravity"));
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

    private Block createBlock(int xPosition, int yPosition, int length) {
        return new Block(xPosition, yPosition, length);
    }

    private Block[] createArrayBlocks(int countBlocks) { //пока countBlocks нужен для идеалогии, но данные уже введены
        Block[] arrayBlocks = new Block[countBlocks];
        for (int i = 0; i <= countBlocks - 1; i++){
            arrayBlocks[i] = new Block(arrayBlocksInt[i][0], arrayBlocksInt[i][1], arrayBlocksInt[i][2]);
        }
        return arrayBlocks;
    }

    private Hedgehog createHog(int xPosition, int yPosition, int radius) {
        return new Hedgehog(xPosition, yPosition, radius);
    }

    private Hedgehog[] createArrayHogs(int countHog) { //аналогично нужен только формально
        Hedgehog[] arrayHogs = new Hedgehog[countHog];
        for (int i = 0; i <= countBlocks - 1; i++){
            arrayHogs[i] = new Hedgehog(arrayHogsInt[i][0], arrayHogsInt[i][1], arrayHogsInt[i][2]);
        }
        return arrayHogs;
    }

    public void start(){
        BattleGround battleGround = new BattleGround();
        battleGround.setCountBlocks(7);
        battleGround.setCountHog(2);
        battleGround.setHeight(600);
        battleGround.setWidth(600);
        battleGround.setGravity(1);

    }

}

