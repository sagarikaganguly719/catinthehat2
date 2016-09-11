package pack1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Demo extends JFrame implements ActionListener
{
JTextField x;
JButton b1;
JProgressBar p;
Container c;
Demo()
{ c=getContentPane();
c.setLayout(new FlowLayout());
b1=new JButton("click repeatedly");
p=new JProgressBar();
p.setForeground(Color.green);
p.setStringPainted(true);
c.add(b1);
c.add(p);
b1.addActionListener((ActionListener) this);
    x=new JTextField(20);
    c.add(x);
    //x.setEditable(true);
    //x.setText("Hello world");
    setSize(400,400);
    setTitle("my swing program");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public static void main(String args[])
{
    Demo d=new Demo();
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        //everytime button is clicked progress bar value increments by 5
        p.setValue(p.getValue()+5);
    }
}
