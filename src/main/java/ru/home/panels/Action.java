package ru.home.panels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface Action extends KeyListener {
    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);
}
