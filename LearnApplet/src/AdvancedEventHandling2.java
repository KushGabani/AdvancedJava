import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedEventHandling2 extends Applet {
    Button btn;
    Label txt;

    @Override
    public void init() {
        btn = new Button("Click");
        txt = new Label();
        txt.setSize(80, 20);

        add(btn);
        add(txt);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Welcome");
            }
        });
    }

}