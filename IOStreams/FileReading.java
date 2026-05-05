package IOStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try
        {
            File fl = new File("src/IOStreams/Hello");
            BufferedReader br = new BufferedReader(new FileReader(fl)) ;
            String str;
            while ((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
