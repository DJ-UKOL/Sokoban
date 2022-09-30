package model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {

    public LevelLoader(Path levels) {
    }

    public GameObjects getLevel(int level) {
        Set<Wall> walls = new HashSet<>();
        walls.add(new Wall(Model.FIELD_CELL_SIZE/2, Model.FIELD_CELL_SIZE/2));
        walls.add(new Wall(Model.FIELD_CELL_SIZE/2, Model.FIELD_CELL_SIZE/2));
        Set<Box> boxes = new HashSet<>();
        boxes.add(new Box(Model.FIELD_CELL_SIZE/2, Model.FIELD_CELL_SIZE/2));
        Set<Home> homes = new HashSet<>();
        homes.add(new Home(Model.FIELD_CELL_SIZE/2, Model.FIELD_CELL_SIZE/2));

        return new GameObjects(walls, boxes, homes, new Player(Model.FIELD_CELL_SIZE/2, Model.FIELD_CELL_SIZE/2));
    }
}
