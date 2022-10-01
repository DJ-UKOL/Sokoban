package model;

import controller.EventListener;

import java.nio.file.Paths;

/*
 * Этот класс будет отвечать за модель нашей игры
 */
public class Model {
    public static final int FIELD_CELL_SIZE = 20;       // размер ячейки игрового поля
    EventListener eventListener;
    private GameObjects gameObjects;                    // будет хранить игровые объекты
    private int currentLevel = 1;                       // текущий уровень
    private LevelLoader levelLoader = new LevelLoader(Paths.get("res/levels.txt"));                    // загрузчик уровней

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }

    public void restartLevel(int level) {
        gameObjects = levelLoader.getLevel(level);
    }

    public void restart() {
        restartLevel(currentLevel);
    }

    public void startNextLevel() {
        currentLevel++;
        restartLevel(currentLevel);
    }

    public void move(Direction direction) {
        // add code here
    }
}
