package ru.home.panels;

import ru.home.Main;

import java.awt.event.KeyEvent;

public class ActionImpl implements Action {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xSpeed = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            xSpeed = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            int t = 0;
            for (int i = 0; i <= m - 1; i++){
                if (f1(i) == 1){
                    t = 1;
                }
            }
            if (t == 1){
                         = 12;
                Main.jump.sound();
                Main.jump.setVolume();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_D){
            vx2 = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_A){
            vx2 = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_W){
            int t = 0;
            for (int i = 0; i <= m - 1; i++){
                if (f2(i) == 1){
                    t = 1;
                }
            }
            if (t == 1){
                vy2 = 12;
                Main.jump.sound();
                Main.jump.setVolume();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xSpeed = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            xSpeed = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_D){
            vx2 = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_A){
            vx2 = 0;
        }
    }

    timer = new Timer(1, (e) -> {
        if (xSpeed < 0 && xPosition <= 0){
            xSpeed = 0;
            xPosition = 0;
        }
        if (xPosition + 2 * radius >= 590 && xSpeed > 0){
            xSpeed = 0;
            xPosition = 590 - 2 * radius;
        }
        xPosition += xSpeed;
        int o = 0;
        for (int j = 0; j <= m - 1; j++){
            if (f1(j) == 1){
                o = 1;
                if ( <= 0){
                         = 0;
                    yPosition = blocksArray[j][1] - 2 * radius;
                }
            }
            if (f1(j) == 2){
                if ( >= 0){
                    yPosition = blocksArray[j][1] + h;
                         = -1 * ;
                }
            }
        }
        yPosition -= ;
        if (o == 0){
                 -= g;
        }


        if (vx2 < 0 && x2 <= 0){
            vx2 = 0;
            x2 = 0;
        }
        if (x2 + 2 * r2 >= 590 && vx2 > 0){
            vx2 = 0;
            x2 = 590 - 2 * r2;
        }
        x2 += vx2;
        o = 0;
        for (int j = 0; j <= m - 1; j++){
            if (f2(j) == 1){
                o = 1;
                if (vy2 <= 0){
                    vy2 = 0;
                    y2 = blocksArray[j][1] - 2 * r2;
                }
            }
            if (f2(j) == 2){
                if (vy2 >= 0){
                    y2 = blocksArray[j][1] + h;
                    vy2 = -1 * vy2;
                }
            }
        }
        y2 -= vy2;
        if (o == 0){
            vy2 -= g;
        }
        if (yPosition > 580){
                 = 0;
            yPosition = 580;
        }
        if (y2 > 580){
            vy2 = 0;
            y2 = 580;
        }
        if (g1() == 1){
            scoreFirstHog += 1;
            if (x2 != 200) {
                x2 = 200;
            }
            else{
                x2 = 500;
            }
            y2 = 580;
            vx2 = 0;
            vy2 = 0;
        }
        if (g2() == 1){
            scoreSecondHog += 1;
            if (xPosition != 500) {
                xPosition = 500;
            }
            else{
                xPosition = 200;
            }
            yPosition = 580;
            xSpeed = 0;
                 = 0;
        }
        window.repaint();
    }
}
