package ru.home.model;

public class Block {
    private int xPosition;
    private int yPosition;
    private int length;
    private final int height;

    public Block(int xPosition, int yPosition, int length) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.length = length;
        this.height = 10;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean hegAbove(Hedgehog hedgehog){
        if (hedgehog.getxPosition() + hedgehog.getRadius() >= xPosition
                && hedgehog.getxPosition() + hedgehog.getRadius() <= xPosition + length){
            if (hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition
                    && hedgehog.getyPosition() >= yPosition){
                return true;
            }
        }
        return false;
    }

    public boolean hegDown(Hedgehog hedgehog){
        if (hedgehog.getxPosition() + hedgehog.getRadius() >= xPosition
                && hedgehog.getxPosition() + hedgehog.getRadius() <= xPosition + length){
            if (hedgehog.getyPosition() <= yPosition + height
                    && hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition - height){
                return true;
            }
        }
        return false;
    }

}
