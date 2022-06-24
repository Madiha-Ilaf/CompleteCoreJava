package collections;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "MSD");
        hash.put(2, "VK");
        hash.put(3, "RS");
        hash.put(4, "SR");
        hash.put(5, "YS");
        hash.put(6, "ABD");
        hash.put(7, "SS");
        hash.put(8, "JR");
        hash.put(9, "KW");
        hash.put(10, "DW");

        System.out.println("Accessing particular key value: " + hash.get(7));

        System.out.println("Copy of the hasmap: " + hash.clone());

        System.out.println("Status of particular value: " + hash.containsValue("YS"));

        System.out.println("Status of particular key: " + hash.containsKey(6));

        System.out.println("Hashmap empty: " + hash.isEmpty());

        System.out.println("Size of hashmap is: " + hash.size());

        System.out.println("All the keys of hashmap are: " + hash.keySet());

        hash.remove(3, "RS");
        System.out.println("After removing a particular key-value pair: " + hash);

        System.out.println("Copying all the elements from one hashmap to another");
        HashMap<Integer, String> copied_hash = new HashMap<Integer, String>();
        copied_hash.putAll(hash);
        System.out.println(copied_hash);
    }
}
