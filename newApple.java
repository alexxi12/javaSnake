import java.util.Random;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;

public class newApple {
    private static Integer apple_x, apple_y;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(applePos.getX(), applePos.getY, 10, 10);
    }
    
}

class applePos {

    

}