package Tank_;

import java.awt.*;

import static Tank_.Direction.*;

public class Tank {
    private int x;
    private int y;

    private Direction dir;

    private int speed = 1;

    private Camp camp;

    public static void main(String[] args) {
    }

    public void move() {
        switch (dir) {
            case UP -> {
                x--;
            }
            case DOWN -> {
                x++;
            }
            case LEFT -> {
                y--;
            }
            case RIGHT -> {
                y++;
            }
        }
    }

    public void draw(Graphics g) {
        if(camp == Camp.Bad) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(Color.orange);
        }
        switch (dir) {
            case UP -> {
                g.fillRect(x, y, 10, 40);
                g.fillRect(x + 30, y, 10, 40);
                g.fillOval(x + 10, y + 10, 20, 20);
                g.fillRect(x + 20, y,2,20);
            }
            case DOWN -> {
                g.fillRect(x, y, 10, 40);
                g.fillRect(x + 30, y, 10, 40);
                g.fillOval(x + 10, y + 10, 20, 20);
                g.fillRect(x + 20, y + 20,2,20);
            }
            case LEFT -> {
                g.fillRect(x, y, 40, 10);
                g.fillRect(x, y+30, 40, 10);
                g.fillOval(x+10, y+10, 20, 20);
                g.fillRect(x, y+20, 20, 2);
            }
            case RIGHT -> {
                g.fillRect(x, y, 40, 10);
                g.fillRect(x, y+30, 40, 10);
                g.fillOval(x+10, y+10, 20, 20);
                g.fillRect(x+ 20, y+20, 20, 2);
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y, Direction dir, Camp camp) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.camp = camp;
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
