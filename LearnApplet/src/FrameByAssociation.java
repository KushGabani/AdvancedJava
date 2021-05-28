import java.awt.*;

public class FrameByAssociation {

    FrameByAssociation() {
        Frame frame = new Frame();
        Button btn = new Button("Click me");

        btn.setBounds(30, 50, 80, 30);
        frame.add(btn);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameByAssociation();
    }
}
