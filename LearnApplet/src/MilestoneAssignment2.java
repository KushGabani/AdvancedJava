import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MilestoneAssignment2 extends Applet implements ActionListener{
    Label l1,l2;
    TextArea area;
    Button b;
    @Override
    public void init(){
        l1=new Label();
        l2=new Label();
        b=new Button("Count Words");
        area=new TextArea();

        l1.setBounds(50,50,100,30);
        l2.setBounds(160,50,100,30);
        area.setBounds(20,100,300,300);
        b.setBounds(100,400,100,30);

        add(l1);
        add(l2);
        add(area);
        add(b);
        b.addActionListener(this);
        setSize(400,450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text=area.getText();
        String[] words =text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }
}  