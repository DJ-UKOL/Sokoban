package model;

import controller.EventListener;

/*
 * Этот класс будет отвечать за модель нашей игры
 */
public class Model {
    public static final int FIELD_CELL_SIZE = 20;       // размер ячейки игрового поля
    EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
