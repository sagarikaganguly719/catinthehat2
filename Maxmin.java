
package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class Maxmin extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2;
    
    Maxmin()
    {  setLayout(new FlowLayout());
        t1=new TextField(1);
        t2=new TextField(1);
        t3=new TextField(1);
        b1=new Button("max");
        b2=new Button("min");
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener((ActionListener)this);
        b2.addActionListener((ActionListener)this);
        setSize(400,400);
    setTitle("MAXMIN");
    setVisible(true);
    
    this.addWindowListener(new WindowAdapter ()
            {
                public void windowCLosing(WindowEvent e)
            {
                System.exit(0);
            }
            });
 
}

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
         String d=ae.getActionCommand();
       String s1=t1.getText();
         int a=Integer.parseInt(s1);
         String s2=t2.getText();
         int b=Integer.parseInt(s2);
         String s3=t3.getText();
         int c=Integer.parseInt(s3);
        if(d.equals("max"))
        {
            int max=a;
            if(b>a && b>c)
                max=b;
            else
                if(c>a &&c>b)
                    max=c;
            System.out.println(max);
        }
        else
            if(d.equals("min"))
            {
                int min=a;
                if(b<a && b<c)
                    min=b;
                else
                    if(c<a && c<b)
                        min=c;
                 System.out.println(min);
            }
            
        
    }

    public static void main(String args[])
    {
       Maxmin j=new Maxmin();
       
       
    }

}