package collections;

import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        java.util.ArrayList<String> str = new java.util.ArrayList<>(
                Arrays.asList("Zero", "One", "Two", "Three", "Four", "Five"));
        System.out.println(str);
        str.add("Six");
        str.add("Seven");
        str.add("Eight");
        str.add("Nine");
        System.out.println("After adding:" + str);

        Iterator<String> itr = str.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        str.add(1, "First");
        System.out.println("After adding at specific index: " + str);

        str.remove(1);
        System.out.println("After removing at specific index: " + str);

        str.set(1, "First");
        System.out.println("After updating at specific index: " + str);

        System.out.println("The specified element is at the index: " + str.indexOf("Three"));

        System.out.println("The element at the specified index is: " + str.get(5));

        System.out.println("The size of the array list is: " + str.size());

        System.out.println("The element status: " + str.contains("Five"));

        System.out.println("After removing all elements: ");
        str.clear();
        System.out.println(str);

    }
}