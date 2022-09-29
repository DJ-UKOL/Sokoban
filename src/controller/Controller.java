package controller;

import model.Model;
import view.View;

public class Controller {
    View view;
    Model model;

    public Controller() {
        view = new View(this);
        model = new Model();
    }

    public static void main(String[] args) {

    }
}
