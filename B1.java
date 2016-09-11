package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class B1 extends Applet implements ActionListener
{  Checkbox c1,c2;
Button b1;
public void init()
{
    c1=new Checkbox("male",null,false);
    c2=new Checkbox("female",null,false);
    b1=new Button("submit");
add(c1);
add(c2);
add(b1);
b1.addActionListener(this);
}
   @Override
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("submit"))
     repaint();
    }
    public void paint(Graphics g)
    {
       g.setColor(Color.blue);
       if(c1.getState())
           g.drawString("male",100,100);
       else
           if(c2.getState())
               g.drawString("female",200,200);
    }
    
}
