package ru.home.model;

public class Hedgehog {
    private int number;
    private int xPosition;
    private int yPosition;
    private int radius;
    private int xSpeed;
    private int ySpeed;
    private int score;


    public Hedgehog(int number, int xPosition, int yPosition, int radius) {
        this.number = number;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
        this.score = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

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


    public boolean hegAboveHeg(Hedgehog hedgehog){
        if (hedgehog.getxPosition() + hedgehog.getRadius() >= xPosition
                && hedgehog.getxPosition() + hedgehog.getRadius() <= xPosition + 2 * radius){
            if (hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition
                    && hedgehog.getyPosition() >= yPosition){
                return true;
            }
        }
        return false;
    }

    public boolean hegDownHeg(Hedgehog hedgehog){
        if (hedgehog.getxPosition() + hedgehog.getRadius() >= xPosition
                && hedgehog.getxPosition() + hedgehog.getRadius() <= xPosition + 2 * radius){
            if (hedgehog.getyPosition() <= yPosition + 2 * radius
                    && hedgehog.getyPosition() + 2 * hedgehog.getRadius() >= yPosition - 2 * radius){
                return true;
            }
        }
        return false;
    }
    public void updatePosition(BattleGround battleGround){
        if (xSpeed < 0 && xPosition <= 0){ //проверяем, заходит ли за левую границу
            xSpeed = 0;
            xPosition = 0;
        }
        if (xSpeed + 2 * radius >= battleGround.getWidth() && xSpeed > 0){ //проверяем, заходит ли за правую границу
            xSpeed = 0;
            xPosition = battleGround.getWidth() - 2 * radius;
        }
        Boolean check = false;
        for (int j = 0; j < battleGround.getBlocks().length; j++){
            if (battleGround.getBlocks()[j].hegAbove(this)){ //Посмотреть, где лежит blocks[]
                check = true;
                if (ySpeed <= 0){
                    ySpeed = 0;
                    yPosition = battleGround.getBlocks()[j].getyPosition() - 2 * radius;
                }
            }

            if (battleGround.getBlocks()[j].hegDown(this)){
                if (ySpeed >= 0){
                    yPosition = battleGround.getBlocks()[j].getyPosition()
                            + battleGround.getBlocks()[j].getHeight();
                    ySpeed = -1 * ySpeed;
                }
            }
            if (battleGround.getBlocks()[j].hegRight(this)){
                if (xSpeed <= 0){
                    xPosition = battleGround.getBlocks()[j].getxPosition()
                            + battleGround.getBlocks()[j].getLength() + 2; //чтобы ёж не прилипал к стенкам
                    xSpeed = 0; //чтобы ёж не прилипал к стенкам
                }
            }
            if (battleGround.getBlocks()[j].hegLeft(this)){
                if (xSpeed >= 0){
                    xPosition = battleGround.getBlocks()[j].getxPosition() - 2 * radius - 2; //аналогично чтобы ёж не застрял
                    xSpeed = 0;
                }
            }
        }
        for (int i = 0; i < battleGround.getHogs().length; i++){
            if (i != number){
                if (this.hegAboveHeg(battleGround.getHogs()[i])){
                    xSpeed = 0;
                    ySpeed = 0;
                    xPosition = BattleGround.arrayHogsInt[number][0]; //стартовые координаты
                    yPosition = BattleGround.arrayHogsInt[number][1]; //см выше
                }
                if (this.hegDownHeg(battleGround.getHogs()[i])){
                    score += 1;
                }
            }
        }
        yPosition -= ySpeed;
        xPosition += xSpeed;
        if (check == false){
            ySpeed -= battleGround.getGravity();
        }
    }
}
