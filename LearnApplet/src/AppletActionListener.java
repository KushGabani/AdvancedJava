import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListener extends Applet implements ActionListener {
    Button btn;
    TextField txt;

    @Override
    public void init() {
        btn = new Button("Click");
        txt = new TextField();

        btn.setBounds(50, 50, 80, 30);
        txt.setBounds(50, 100, 80, 30);

        add(btn);
        add(txt);
        setLayout(null);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txt.setText("Button Clicked");
    }
}
