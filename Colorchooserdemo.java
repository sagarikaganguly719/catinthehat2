package pack1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Colorchooserdemo extends JFrame implements ActionListener
{  JButton b1;
Container c;
Colorchooserdemo()
{     //ContentPane is accessed through the only function :getContentPane()
    c=getContentPane();
    c.setLayout(new FlowLayout());
    
    //creating a button
    b1=new JButton("Color");
    c.add(b1);
    
    b1.addActionListener(this);
    setSize(250,300);
    setTitle("color chooser");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        Color sel=null;
        
       Color color=JColorChooser.showDialog(this,"select a color",sel);
       if(color!=null)
       {
           sel=color;
       }
       c.setBackground(color);
        
    }
    public static void main(String args[])
    {
        Colorchooserdemo d=new Colorchooserdemo();
       
    }
}
