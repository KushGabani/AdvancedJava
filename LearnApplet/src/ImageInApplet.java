import java.applet.Applet;
import java.awt.*;

public class ImageInApplet extends Applet {
    Image picture;

    @Override
    public void init() {
        picture = getImage(getDocumentBase(), "image.jpg");
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(picture, 250, 250, this);
    }
}
