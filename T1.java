//threads demo
package pack1;

import java.io.*;

public class T1 extends Thread
{
    boolean stop=false;
    //static int p=5;
    public void run()
    {
        try
        {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
            //if(stop)
              //  return;
        }
        }catch(InterruptedException e)
                {
                e.printStackTrace();
                }
    
    }
    public static void main(String args[])throws IOException
    {
        T1 a=new T1();
        Thread t=new Thread(a);
        
        t.start();
        //stop the thread when enter key is pressed
       // System.in.read();   //wait till enter key is pressed
       // a.stop=true;
       
        
    }
}


