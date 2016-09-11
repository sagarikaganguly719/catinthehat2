package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.Button;
public class ButtonDemo extends Applet
{  Button b1,b2;
/*<applet code="ButtonDemo.class" width=1000 height=100> </applet>*/
    @Override
    public void init()
{    
    b1=new Button("first");
     b2=new Button("second");
     //String l=b1.getLabel();
    //b1.setLabel("okay");
    add(b1);
     add(b2);
}
}
    /*void setLabel(String nm)
    {
        this.b1=new Button(nm);
    }
Button getLabel()
{
    return b1;
}*/
/*public static void main(String args[])
{
    Button b1=new Button();
    String l=b1.getLabel();
    b1.setLabel("okay");
    b1.setVisible(true);
}  */
