
package pack1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Filedemo extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu file,edit,format,fo;
JMenuItem op,sa,cl,f1,f2;
Container c;
Filedemo()
{
    c=getContentPane();
    c.setLayout(new BorderLayout());
    
    mb=new JMenuBar();
    
    c.add("North",mb);
    
    file=new JMenu("File");
    edit=new JMenu("Edit");
    format=new JMenu("Format");
    
    mb.add(file);
    mb.add(edit);
    mb.add(format);
    
    op=new JMenuItem("Open");
    sa=new JMenuItem("Save");
    cl=new JMenuItem("Close");
    
    
    file.add(op);
    file.addSeparator();
    file.add(sa);
    file.addSeparator();
    file.add(cl);
    file.addSeparator();
    fo=new JMenu("Font");
    file.add(fo);
    
    //creating sub menus
    f1=new JMenuItem("Arial");
    f2=new JMenuItem("Comic Sans MS");
    
    fo.add(f1);
    fo.add(f2);
    
    setSize(400,400);
    setTitle("file demo");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
    }
    public static void main(String args[])
    {
        Filedemo f=new Filedemo();
    }
    
}
