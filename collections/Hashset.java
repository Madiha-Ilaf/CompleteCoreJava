package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        hash.add("MSD");
        hash.add("FD");
        hash.add("FRJ");
        hash.add("FM");
        hash.add("RK");
        hash.add("GJ");
        hash.add("KH");
        hash.add("TL");
        hash.add("CH");
        hash.add("SD");

        hash.add("TL"); // doesnt allow duplicates
        System.out.println(hash);

        Iterator<String> itr = hash.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("Clone of hashset is: " + hash.clone());

        hash.remove("GJ");
        System.out.println("After removing a particular element: " + hash);

        System.out.println("Empty: " + hash.isEmpty());

        System.out.println("Size of the hashset: " + hash.size());

        System.out.println("Contains a particular element: " + hash.contains("KH"));

        hash.clear();
        System.out.println("After removing all elements: " + hash);

    }

}
