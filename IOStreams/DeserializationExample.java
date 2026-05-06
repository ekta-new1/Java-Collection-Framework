package IOStreams;

import java.io.*;

public class DeserializationExample {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("src/IOStreams/Demo"); //Connects program to file.

        ObjectInputStream ois = new ObjectInputStream(fis);  //Reads object bytes.

        // Read object
        Student s = (Student) ois.readObject();
        //Deserialization happens here.
       // Bytes convert into original object
        // Returns Object type, so typecasting is needed.

        ois.close();
        fis.close();

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
//Object restored successfully.
