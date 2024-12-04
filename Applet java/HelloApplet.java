import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {
    public void init() {
        System.out.println("initialized");

    }

    public void start() {
        System.out.println("started");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 50);
    }

    public void stop() {
        System.out.println("stopped");
    }

    public void destroy() {
        System.out.println("destroyed");
    }
}