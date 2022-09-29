package view;

import controller.Controller;

import javax.swing.*;

/*
 * Этот класс будет отвечать за графическое представление нашей игры
 */
public class View extends JFrame {
    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }
}
