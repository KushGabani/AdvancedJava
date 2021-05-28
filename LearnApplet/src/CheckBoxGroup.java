import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxGroup extends Applet implements ItemListener {
    Label label;
    CheckboxGroup cg1;
    Checkbox r1, r2;

    @Override
    public void init() {
        label = new Label("Radio Button Checked: ");
        cg1 = new CheckboxGroup();
        r1 = new Checkbox("Java", cg1, false);
        r2 = new Checkbox("Python", cg1, false);

        add(label);
        add(r1);
        add(r2);

        r1.addItemListener(this);
        r2.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        label.setText((e.getSource() == r1 ? "Java Checked" : "Python Checked"));
    }
}
