import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling2 extends Applet implements ActionListener {
    Button btn;
    TextField text;

    @Override
    public void init() {
        btn = new Button("Click");
        text = new TextField();

        add(text);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("Action Performed");
    }
}
