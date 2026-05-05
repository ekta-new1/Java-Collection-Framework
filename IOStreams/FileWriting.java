package IOStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try
        {
            File fl = new File("src/IOStreams/Hello");
            String str="my name is sia";
            FileWriter fw = new FileWriter(fl) ;
            fw.write(str);
            fw.close();
        }
        catch (IOException e)
        { e.printStackTrace(); }
    }

}
