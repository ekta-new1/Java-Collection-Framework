package Sets;

import java.util.HashSet;
import java.util.Set;

//HashSet is part of Java Collections Framework
//It stores unique elements only
//It is unordered (no guaranteed insertion order)
//Internally uses a HashMap
//Fast operations

//Imagine you’re building a signup system.

public class HashSetExample {
    public static void main(String[] args) {
//Set is an interface, HashSet is a class implemented with the help of Set interface
        Set<String> usernames = new HashSet<>();

        usernames.add("ekta123");
        usernames.add("ekta123"); // duplicate ignored
        usernames.add("ekta_verma");
        usernames.add("e123");

        System.out.println(usernames);
    }
}

//Use HashSet when:
//You want uniqueness
//Order doesn’t matter
//Fast lookup needed
