import java.applet.Applet;
import java.awt.*;

public class AppleLifeCycle extends Applet {
    @Override
    public void init() {
        System.out.println("Life Cycle: init() method");
    }

    @Override
    public void start() {
        System.out.println("Life Cycle: start() method");
    }

    @Override
    public void paint(Graphics graphics) {
        System.out.println("Life Cycle: paint() method");
        graphics.drawString("Hello World", 50, 50);
    }

    @Override
    public void stop() {
        System.out.println("Life Cycle: stop() method");
    }

    @Override
    public void destroy() {
        System.out.println("Life Cycle: destroy() method");
    }
}
