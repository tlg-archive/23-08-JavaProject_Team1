package com.space;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyHandler implements KeyListener {

    public static boolean upPressed, leftPressed, rightPressed, shootPressed;
    public static boolean upReleased, leftReleased, rightReleased, shootReleased;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                upPressed = true;
                break;
            case KeyEvent.VK_LEFT:
                leftPressed = true;
                break;
            case KeyEvent.VK_RIGHT:
                rightPressed = true;
                break;
            case KeyEvent.VK_SPACE:
                shootPressed = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                upPressed = false;
                upReleased = true;
                break;
            case KeyEvent.VK_LEFT:
                leftPressed = false;
                leftReleased = true;
                break;
            case KeyEvent.VK_RIGHT:
                rightPressed = false;
                rightReleased = true;
                break;
            case KeyEvent.VK_SPACE:
                shootPressed = false;
                shootReleased = true;
                break;
        }
    }
}
