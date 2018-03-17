import java.util.*;
import java.io.File;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args)
    throws IOException
    {
        Scanner textfile = new Scanner(new File("Some_Numbers.txt"));

        filereader(textfile);
    }   


    static void filereader(Scanner textfile)
    {
        int i = 0;
        int sum = 0;

        while(i <= 19)
        {
            System.out.println(textfile.nextInt());
            sum = sum + textfile.nextInt();
            i++;
        }
    }



}