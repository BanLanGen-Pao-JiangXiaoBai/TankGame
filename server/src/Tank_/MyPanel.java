package Tank_;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;

    public MyPanel() {
        this.hero = new Hero(100, 100, Direction.RIGHT, Camp.Good);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        hero.draw(g);
    }
}
