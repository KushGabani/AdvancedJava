import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListInAWT extends Applet implements ActionListener {
    Label label;
    List lang;
    List framework;
    Button btn;

    @Override
    public void init() {
        label = new Label();
        lang = new List(4, false);
        framework = new List(4, true);
        btn =  new Button("show");

        lang.add("Java");
        lang.add("PHP");
        lang.add("Python");
        lang.add("C++");

        framework.add("Turbo C++");
        framework.add("Spring");
        framework.add("Hibernate");
        framework.add("CodeIgniter");

        add(label);
        add(lang);
        add(framework);
        add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder data = new StringBuilder("Programming language Selected: " + lang.getItem(lang.getSelectedIndex()));
        data.append(", Framework Selected:");
        for(String frame:framework.getSelectedItems()){
            data.append(frame).append(" ");
        }
        label.setText(data.toString());
    }
}
