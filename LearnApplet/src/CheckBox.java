import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox extends Applet{
    Label label;
    Checkbox cb1;
    Checkbox cb2;

    @Override
    public void init() {
        label = new Label("Checkbox checked: ");
        cb1 = new Checkbox("Java");
        cb2 = new Checkbox("Python", true);

        label.setBounds(50, 50, 200, 20);
        cb1.setBounds(50, 80, 80, 20);
        cb2.setBounds(50, 110, 80, 20);

        add(label);
        add(cb1);
        add(cb2);
        setLayout(null);

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });

        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Python Checkbox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
    }
}
