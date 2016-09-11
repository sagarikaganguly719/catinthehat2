
package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class B3 implements WindowListener
{   public static void main(String args[])
{
    Frame f=new Frame("my awt frame");
    f.setSize(300,250);
    f.setVisible(true);
       f.addWindowListener(new B3());
}
public void windowClosing(WindowEvent e)
{
    System.exit(0);
}

    @Override
    public void windowOpened(WindowEvent we) {
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
       
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
}