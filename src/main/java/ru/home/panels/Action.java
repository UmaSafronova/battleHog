package ru.home.panels;

import ru.home.model.Hedgehog;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface Action extends KeyListener {
    public void keyPressed(KeyEvent key, Hedgehog hedgehog);
    void keyReleased(KeyEvent e);
}
