package pack1;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=ChoiceboxDemo.class" height=200 width=200></applet> */
public class ChoiceboxDemo extends Applet implements ItemListener
{  Choice colorList;
String colr[];
public void init()
{
    colr=new String[3];
    colr[0]="red";
    colr[1]="blue";
    colr[2]="green";
    colorList=new Choice();
    add(colorList);
    //colorList.add("red");
    //colorList.add("green");
    //colorList.add("blue");
    for(int i=0;i<3;i++)
    {
        System.out.println(colr[i]);
        colorList.insert(colr[i],i);
    }
    
    setLayout(new GridLayout());
    add(colorList);
    colorList.addItemListener(this);
}

    @Override
    public void itemStateChanged(ItemEvent ie)
    {
        int selection;
        selection=colorList.getSelectedIndex();
        if(selection==0)
            setBackground(Color.red);
        else
            if(selection==1)
                setBackground(Color.blue);
        else
                setBackground(Color.green);
    }
}
