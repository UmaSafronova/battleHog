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
        this.height = 10; //взять из game.properties
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

    public boolean hegRight(Hedgehog hedgehog){
        if ((hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition
                && hedgehog.getyPosition() + 2 * hedgehog.getRadius() <= xPosition - height)
                || (hedgehog.getyPosition() >= yPosition) && hedgehog.getyPosition() <= xPosition - height){
            if (hedgehog.getxPosition() <= xPosition + length && hedgehog.getxPosition() + 2 * hedgehog.getRadius() >= xPosition + length){
                return true;
            }
        }
        return false;
    }

    public boolean hegLeft(Hedgehog hedgehog){
        if ((hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition
                && hedgehog.getyPosition() + 2 * hedgehog.getRadius() <= xPosition - height)
                || (hedgehog.getyPosition() >= yPosition) && hedgehog.getyPosition() <= xPosition - height){
            if (hedgehog.getxPosition() + 2 * hedgehog.getRadius() >= xPosition && hedgehog.getxPosition() <= xPosition){
                return true;
            }
        }
        return false;
    }

}
