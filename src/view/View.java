package view;

import controller.Controller;

import javax.swing.*;

/*
 * Этот класс будет отвечать за графическое представление нашей игры
 */
public class View extends JFrame {
    Controller controller;
    Field field;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }
}
