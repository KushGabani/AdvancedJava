import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet{
    public void paint(Graphics graphics) {
        graphics.drawString("Hello World", 10, 25);
    }
}
