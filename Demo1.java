
package pack1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Demo1 extends JFrame implements ActionListener
{JButton b1,b2,b3;
Container c;
Demo1()
        { c=getContentPane();
        c.setLayout(new FlowLayout());
            b1=new JButton("b1");
            b2=new JButton("b2");
            b3=new JButton("b3");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
            setSize(400,400);
            setTitle("button program");
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
   @Override
    public void actionPerformed(ActionEvent ae) {
        String s=ae.getActionCommand();
        if(s.equals("b1"))
        c.setBackground(Color.blue);
        if(s.equals("b2"))
        c.setBackground(Color.green);
        if(s.equals("b3"))
        c.setBackground(Color.red);
        
    }
    public static void main(String args[])
    {
        Demo1 d=new Demo1();
        
    }
    
}
