package ru.home.model;

public class Hedgehog {
    private int xPosition;
    private int yPosition;
    private int radius;
    private int xSpeed;
    private int ySpeed;
    private int score;


    public Hedgehog(int xPosition, int yPosition, int radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
        this.score = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
