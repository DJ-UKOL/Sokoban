package model;

import java.util.HashSet;
import java.util.Set;

/*
 * будет хранить игровые объекты
 */
public class GameObjects {

    public Set<Wall> walls;
    public Set<Box> boxes;
    public Set<Home> homes;
    public Player player;

    public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player) {
        this.walls = walls;
        this.boxes = boxes;
        this.homes = homes;
        this.player = player;
    }

    public Set<GameObject> getAll() {
        Set<GameObject> setGameObjects = new HashSet<>(walls);
        setGameObjects.addAll(boxes);
        setGameObjects.addAll(homes);
        setGameObjects.add(player);
        return setGameObjects;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public Player getPlayer() {
        return player;
    }
}
