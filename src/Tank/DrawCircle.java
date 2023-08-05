package Tank;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel1 panel;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        panel = new MyPanel1();
        this.add(panel);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel1 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillOval(10,10,50,50);
    }
}