package model;

import java.awt.*;

abstract public class GameObject {
    protected int x;
    protected int y;
    protected int width = Model.FIELD_CELL_SIZE;
    protected int height = Model.FIELD_CELL_SIZE;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics graphics);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
