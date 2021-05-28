import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Dropdown extends Applet {
    Label label;
    Choice lang;
    Button btn;

    @Override
    public void init() {
        label = new Label();
        lang = new Choice();
        btn = new Button("submit");

        lang.add("Java");
        lang.add("Python");
        lang.add("PHP");
        lang.add("C++");

        add(lang);
        add(btn);
        add(label);

        lang.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText(e.getSource().toString());
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Programming language selected: " + lang.getItem(lang.getSelectedIndex()));
            }
        });
    }
}
