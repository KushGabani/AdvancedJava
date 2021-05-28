import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedEventHandling extends Applet {
    Button btn;
    TextField txt;

    @Override
    public void init() {
        btn = new Button("Click");
        txt = new TextField();

        add(btn);
        add(txt);
        AnotherClass ac = new AnotherClass(this);
        btn.addActionListener(ac);
    }
}

class AnotherClass implements ActionListener {
    AdvancedEventHandling object;

    AnotherClass(AdvancedEventHandling object) {
        this.object = object;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        object.txt.setText("Welcome");
    }
}