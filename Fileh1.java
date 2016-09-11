//first filehandling program demo
package pack1;
import java.io.*;
public class Fileh1
{
    public static void main(String args[])throws IOException
    {
        //attaching keyboard to DataInputStream
        DataInputStream dis=new DataInputStream(System.in);
        
        //attaching file to FileOutputStream
        FileOutputStream fout=new FileOutputStream("myfile.txt",true);
        
        System.out.println("enter text");
        
        char ch;
        
        
        //read characters into ch and write them to the file
        
        ch=(char)dis.read();
            fout.write(ch);
        
        fout.close();
    }
}
