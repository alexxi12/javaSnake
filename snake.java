import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * snake
 */
public class snake {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel title, start;
    static Integer apple_x;
    static Integer apple_y;
    private static Integer width, height;
    public static void main(String[] args) {
        createFrame();
    }

    //game frame and main menu
    private static void createFrame() {
        frame = new JFrame();
        panel = new JPanel();

        title = new JLabel("Snake the Game");
        start = new JLabel("PLAY");
        title.setBounds(100, 75, 100, 75);
        start.setBounds(100, 75 ,100, 75);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        start.setFont(new Font("Arial", Font.BOLD, 18));

        MouseListener l = new MouseListener() {
            Font original = start.getFont();
            Map attributes = original.getAttributes();

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                start.setFont(original.deriveFont(attributes));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                start.setFont(original);
                
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                new drawBoard(frame);
                
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

        };

        start.addMouseListener(l);

        //positioning
        title.setHorizontalAlignment(JLabel.CENTER);

        //panel
        panel.setBorder(BorderFactory.createEmptyBorder(400, 400, 400, 400));
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        panel.add(title, BorderLayout.CENTER);
        panel.add(start);

        //frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.pack();
        frame.setVisible(true);
    }
}