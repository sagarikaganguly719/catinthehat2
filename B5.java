package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class B5 extends Frame implements ItemListener
{
    Choice c1;
   
    B5()
    {
        setLayout(new FlowLayout());
    c1=new Choice();
    c1.add("love");
    c1.add("fire");
    c1.add("ice");
    
    add(c1);
    c1.addItemListener(this);
    setSize(400,400);
    setTitle("flames");
    setVisible(true);
    
    addWindowListener(new WindowAdapter ()
            {
                public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
            });
    }
            

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        int s;
        s=c1.getSelectedIndex();
        if(s==0)
            setBackground(Color.magenta);
        else
            if(s==1)
                setBackground(Color.red);
        else
                setBackground(Color.cyan);
        
    }
    public static void main(String args[])
    {
        B5 b=new B5();
        
    }
}
