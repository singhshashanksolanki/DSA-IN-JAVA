package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding the elements in the list
        list.add(1);
        list.add(5);
        list.add(3);

        // Printing the whole list
        System.out.println(list);

        // Get elemtns
        int element = list.get(0);
        System.out.println(element);

        // Adding the elements in the middle of the list
        list.add(1, 1);
        System.out.println(list);

        // Updating the existing element on the specified index
        list.set(1, 4);
        System.out.println(list);

        // Delete Element
        list.remove(1);
        System.out.println(list);

        // Size of the list
        int size = list.size();
        System.out.println("List size: " + size);

        // Iteration on array list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Sort the list
        Collections.sort(list);
        System.out.println(list);
    }
}
