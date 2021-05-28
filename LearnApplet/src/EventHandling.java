import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandling extends Applet implements MouseListener {
    StringBuffer str;

    void additem(String word) {
        str.append(word);
        repaint();
    }

    @Override
    public void init() {
        addMouseListener(this);
        str = new StringBuffer();
        additem("Life Cycle: init() method\n");
    }

    @Override
    public void start() {
        additem("Life Cycle: start() method\n");
    }

    @Override
    public void stop() {
        additem("Life Cycle: stop() method\n");
    }

    @Override
    public void destroy() {
        additem("Life Cycle: destroy() method\n");
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g.drawString(str.toString(), 10, 20);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        additem("Event: Mouse Clicked\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}