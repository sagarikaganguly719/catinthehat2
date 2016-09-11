
package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class B4 extends Frame implements ActionListener
{ Button b1,b2;
Checkbox c1;
TextField tf;
Label l1;
public static void main(String args[])
{
    B4 f=new B4();
    f.setSize(200,200);
    f.setTitle("lalala");
    
    f.setVisible(true);
}
B4()
{   //set a layout
    setLayout(new FlowLayout());
    
    //creating 2 buttons
   b1=new Button("first");
   b2=new Button("second");
   c1=new Checkbox("pick",null,false);
   tf=new TextField(10);
   l1=new Label("name:");
   add(b1);
   add(b2);
   add(c1);
   add(l1);
   add(tf);
   //add actionListener to the buttons
   b1.addActionListener(this);
   b2.addActionListener(this);
   
   addWindowListener(new WindowAdapter ()
   {
       public void windowClosing(WindowEvent e)
       {
           System.exit(0);
       }
   });
   }//end of constructor

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String str=ae.getActionCommand();
        if(str.equals("first"))
            setBackground(Color.cyan);
        if(str.equals("second"))
            setBackground(Color.red);
    }

}