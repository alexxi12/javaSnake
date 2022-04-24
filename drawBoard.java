// MADE AFTER THIS MODEL https://stackoverflow.com/questions/28809000/how-to-insert-jpanel-beside-a-grid

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class drawBoard extends JPanel {
    private static final Dimension pref_size = new Dimension(20, 20);
    private static JPanel panel;

    public drawBoard() {
        
        createMap(40, 40);
	}

    public void createMap(int maxX, int maxY) {
        //create 40x40 grid of panels for the snake to move around in
        for (int i=1; i < maxX+1; i++) {
            for (int j=1; j < maxY+1; j++) {

                panel = new JPanel();
                add(panel);
                panel.setPreferredSize(pref_size);
                String name = String.format("[%d, %d]", i, j);
                setLayout(new GridLayout(maxX, maxY, 1, 1)); //change gap to 0 after tests are done
                setBackground(Color.GRAY); 
                panel.setName(name);

            }
        }

        //key listener
        //use model for grid movement 
        addKeyListener(new KeyAdapter() {
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
                    //snake go right
                }
                if (c == KeyEvent.VK_LEFT) {
                    //snake go left
                }
            }
        });

    }

    private static void createFrame() {
        JFrame frame = new JFrame("Snake");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new drawBoard(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setResizable(false);
        
        //create snake entity
        
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //create grid map
                createFrame();
            }
        });
    }
}

class createSnake {

    public createSnake() {
        Random rand = new Random();
        HashMap<Integer, Integer> snakeMap = new HashMap<Integer, Integer>();

        //random spawining point
        int snake_x = rand.nextInt(40);
        int snake_y = rand.nextInt(40);

        //Create snake entity
        plsaceEntity(this, snake_x, snake_y);
    }

    // TODO snake controls  use map!!!!!

}

