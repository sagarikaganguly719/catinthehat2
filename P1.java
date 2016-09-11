package pack1;

import javax.swing.*;
import java.awt.*;
public class P1 extends JFrame
{  JLabel l1;
    P1()
    {
        l1=new JLabel("hello world");
        l1.setFont(new Font("Times New Roman",Font.ITALIC,18));
        l1.setForeground(Color.black);
        add(l1);
    }
    public static void main(String args[])
    {
        P1 b=new P1();
        Container c=b.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);
        b.setSize(400,400);
        b.setTitle("demo");
        b.setVisible(true);
        
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

