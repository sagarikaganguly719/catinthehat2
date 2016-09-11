package pack1;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonDemo2 extends Applet implements ActionListener
{
    Button b1,b2;
    public void init()
    {
        b1=new Button("yellow");
        b2=new Button("blue");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
/*void addActionListener(ActionListener l)
{
    b1.setForeground(Color.yellow);
    b2.setForeground(Color.blue);
}*/
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("yellow"))
        setBackground(Color.yellow);
        if(s.equals("blue"))
        setBackground(Color.blue);
        
    }
    
}
