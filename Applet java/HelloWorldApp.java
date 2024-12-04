import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class HelloWorldApp extends JPanel {

    // Override the paintComponent method to draw graphics
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Ashish Prabhakar!", 50, 50);
    }

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Hello World App");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of the panel
        HelloWorldApp panel = new HelloWorldApp();

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
