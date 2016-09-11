
package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class B8 extends Frame 
{
    Scrollbar s1;
    B8()
    {
        s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
        s1.setBounds(250,50,30,200);
        add(s1);
        setSize(500,500);
    setTitle("blues");
    setVisible(true);
    
        addWindowListener(new WindowAdapter ()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String args[])
    {
        B8 b1=new B8();
    }
}
