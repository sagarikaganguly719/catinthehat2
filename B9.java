
package pack1;

import java.awt.*;
import javax.swing.*;
public class B9 extends JFrame
{
    Container c;
    JComboBox b;
    B9()
    {
        c=getContentPane();
        b=new JComboBox();
        b.addItem("fire");
        b.addItem("ice");
        b.addItem("flames");
        
        c.add("North",b);
        
        setSize(400,400);
setTitle("combo box demo");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        B9 n=new B9();
    }
}
