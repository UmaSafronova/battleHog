package ru.home.panels;

import ru.home.model.Block;
import ru.home.model.Hedgehog;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface Action extends KeyListener {
    void keyPressed(KeyEvent key, Hedgehog hedgehog, Block[] blocks);
    void keyReleased(KeyEvent key, Hedgehog hedgehog);
}
