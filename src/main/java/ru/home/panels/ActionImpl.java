package ru.home.panels;

import ru.home.Main;
import ru.home.model.Block;
import ru.home.model.Hedgehog;

import java.awt.event.KeyEvent;

public class ActionImpl implements Action {

    @Override
    public void keyPressed(KeyEvent key, Hedgehog hedgehog, Block[] blocks) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_RIGHT: {
                hedgehog.setxSpeed(2);
            }
            case KeyEvent.VK_LEFT: {
                hedgehog.setxSpeed(-2);
            }
            case KeyEvent.VK_UP: {
                for (int i = 0; i < blocks.length; i++) {
                    if (blocks[i].hegAbove(hedgehog)){
                        hedgehog.setySpeed(12);
                    }
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent key, Hedgehog hedgehog) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                hedgehog.setxSpeed(0);
            case KeyEvent.VK_LEFT:
                hedgehog.setxSpeed(0);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
