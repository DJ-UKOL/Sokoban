package view;

import controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    View view;
    EventListener eventListener;

    public Field(View view){
        this.view = view;
    }

    public void paint(Graphics g) {

    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
