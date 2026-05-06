package IOStreams;

import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
//We create Student class because we want to serialize a Student object.
//Student s1 = new Student(101, "Ekta");
//This creates an object in RAM.
//What is inside this object?
//s1
// id = 101
// name = Ekta
//Now suppose program closes.
//Everything in RAM disappears.
//So if we want to SAVE this object permanently, we serialize it.

//We implement Serializable because it tells JVM:
//"This object is allowed to be converted into bytes and saved."
//Without this line:
//Java will NOT allow serialization.
//You will get error:
//NotSerializableException
