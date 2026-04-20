import java.io.*;
class E6
{
    public static void main(String[] args)
    {
        try{
        FileInputStream f=new FileInputStream("C:\\Users\\USER\\Desktop\\Manju.txt");
        int i;
        while((i=f.read())!=-1)
        {
            System.out.println((char)i);
        }
        }
        catch(FileNotFoundException f)
        {
            System.out.println("s");
        }
        catch(IOException e1)
        {
            System.out.println("ahbjdh");
        }

    }
}