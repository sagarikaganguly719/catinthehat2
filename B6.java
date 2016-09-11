package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class B6 extends Frame implements ItemListener
{
List l1;
int msg[];
B6()
{  setLayout(new FlowLayout());
//list box with 4 itms and multiple selection is enabled
    l1=new List(5,true);
    //l2=new List(5,true);
    //adding items to list box
    l1.add("romance");
    l1.add("war");
    l1.add("adventure");
    l1.add("fiction");
    l1.add("chickflix");
    
    add(l1);
  //  add(l2);
    l1.addItemListener(this);
     setSize(400,400);
    setTitle("bakchodi");
    setVisible(true);
    
    addWindowListener(new WindowAdapter()
            {
                public void windowCLosing(WindowEvent e)
            {
                System.exit(0);
            }
            });
    
     
}
    @Override
    public void itemStateChanged(ItemEvent ie)
    {
      repaint();
    }
    public void paint(Graphics g)
    {
        msg=l1.getSelectedIndexes();
        
        for(int i=0;i<msg.length;i++)
        {
            String item=l1.getItem(msg[i]);
            //l2.add(item);
           g.drawString(item,100,200+i*20);
        }
    }
    public static void main(String args[])
    {
        B6 b=new B6();
    }
}
