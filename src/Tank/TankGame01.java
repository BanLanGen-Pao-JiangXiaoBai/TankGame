package Tank;

import javax.swing.*;
import java.awt.*;

public class TankGame01 extends JFrame {
    private MyPanel mp;
    public static void main(String[] args) {
        new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
