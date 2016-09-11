package pack1;

//increasing efficiency of code using BufferedOutputStream
import java.io.*;
public class Fileh2
{
    public static void main(String args[])throws IOException
    {   //attaching keyboard to the file
        DataInputStream dis=new DataInputStream(System.in);
        
        //will write the contents of dis to FileOutputStream object
        FileOutputStream fout=new FileOutputStream("file1.txt",true);
        
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
        
        System.out.println("enter text");
        char ch;
        
        while((ch=(char)dis.read()) != '@')
            bout.write(ch);   //writing the characters to the file
        
        bout.close();  //closing the file
           
    }
}
