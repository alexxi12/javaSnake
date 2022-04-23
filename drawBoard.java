import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drawBoard extends JPanel {
    private static Integer apple_x, apple_y;

    public drawBoard(JFrame frame) {

        initBoard(frame);
	}

    private void initBoard(JFrame frame) {
        //TODO Spawn apple
        //TODO snake

        //split window into 40x40 grid
        frame.removeAll();
        frame.repaint();

        frame.setLayout(new GridLayout(40, 40, 0, 0));

        //add keylistener
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();

                if (c == KeyEvent.VK_UP) {
                    //snake go up
                }
                if (c == KeyEvent.VK_DOWN) {
                    //snake go down
                }
                if (c == KeyEvent.VK_RIGHT) {
                    //snake go down
                }
                if (c == KeyEvent.VK_LEFT) {
                    //snake go down
                }
            }
        });

        //create map
        createMap(40, 40);
        
        //place random apple
        //randomApple();
    }

    private void createMap(int maxX, int maxY) {
        String [ ] [ ] map = new String [40][40];

            for (int i=1; i < map.length; i++) {
                for (int j=1; i < map.length; j++) {
                    map [i][j] = "["+ i + "," + j + "]";

                    JPanel panel = new JPanel();
                    frame.add(panel);
                    String name = String.format("[%d, %d]", i, j);
                    frame.setLayout(new GridLayout(40, 40, 1, 1));
                    frame.setBackground(Color.GRAY); //to be changed to make map all black after testing
                    panel.setName(name);

                    System.out.println(map[i][j]);
                }
            }
    }

    /*private void randomApple() {
        Random rand = new Random();

        apple_x = rand.nextInt(40);
        apple_y = rand.nextInt(40);
    }*/
}

