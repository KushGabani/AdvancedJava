import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class MilestoneAssignment extends Applet {
    Button btn;
    TextField txt;
    Label label;

    @Override
    public void init() {
        btn = new Button("Find IP");
        txt = new TextField();
        label = new Label();

        btn.setBounds(50, 150, 60, 30);
        label.setBounds(50, 100, 250, 20);
        txt.setBounds(50, 50, 150, 20);

        add(btn);
        add(txt);
        add(label);

        setLayout(null);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String host = txt.getText();
                    String ip = java.net.InetAddress.getByName(host).getHostAddress();
                    label.setText("IP of the host is: " + ip);
                } catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                }
            }
        });
    }
}
