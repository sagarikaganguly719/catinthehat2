package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class B2 extends Applet implements ItemListener
{
    CheckboxGroup cg=null;
    Checkbox m,f;
    String msg=null;
    public void init()
            {
                cg=new CheckboxGroup();
                m=new Checkbox("male",cg,false);
                f=new Checkbox("female",cg,false);
                add(m);
                add(f);
                m.addItemListener((ItemListener) this);
                f.addItemListener((ItemListener) this);
            }
public void paint(Graphics g)
{
    g.drawString("gender is",100,100);
    if(m.getState())
    {g.setColor(Color.blue);
    g.drawString("male",50,50);}
    if(f.getState())
    { g.setColor(Color.pink);
    g.drawString("female",200,200);}
    //g.drawString(cg.getSelectedCheckbox().getLabel(),100,120);
}

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        repaint();
    }
}
