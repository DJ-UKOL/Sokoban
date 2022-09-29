package model;

/*
 * Логика столкновений
 */
public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        if(gameObject == null || direction == null) {
            return false;
        }
        int x = this.getX();
        int y = this.getY();

        switch(direction) {
            case LEFT:
                x -= Model.FIELD_CELL_SIZE;
                break;
            case RIGHT:
                x += Model.FIELD_CELL_SIZE;
                break;
            case DOWN:
                y += Model.FIELD_CELL_SIZE;
                break;
            case UP:
                y -= Model.FIELD_CELL_SIZE;
                break;
        }
        return x == gameObject.getX() && y == gameObject.getY();
    }
}
