package Tank_;

import static Tank_.Direction.*;

public class Tank {
    private int x;
    private int y;

    private Direction dir;

    private int speed = 1;

    public static void main(String[] args) {
    }

    public void move() {
        switch (dir) {
            case UP -> {

            }
            case DOWN -> {
            }
            case LEFT -> {
            }
            case RIGHT -> {
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Tank() {

    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }
}
