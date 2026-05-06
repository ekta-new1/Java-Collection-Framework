package IOStreams;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101, "Ekta"); //Object created in RAM.

        FileOutputStream fos = new FileOutputStream("src/IOStreams/Demo"); //Creates connection with file.

        ObjectOutputStream oos = new ObjectOutputStream(fos);  //Special stream used for objects. It converts object into bytes.

        oos.writeObject(s1); //Serialization happens here. Java converts object into byte stream and stores it in file.

        oos.close();
        fos.close();

        System.out.println("Object Serialized");
    }
}
//What gets stored in file?
//Not readable text because object is stored in binary form.
