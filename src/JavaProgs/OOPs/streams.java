package JavaProgs.OOPs;

// Java Program to Demonstrate streams

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class streams {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty Arraylist
        List<String> companyList = new ArrayList<>();

        // Adding elements to above ArrayList
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");

        // Sorting the list
        // using sorted() method and
        // printing using for-each loop
        companyList.stream().sorted().forEach(
                System.out::println);
    }
}

