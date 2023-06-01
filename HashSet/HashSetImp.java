package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImp {

    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(0);
        set.add(2);
        set.add(3);
        set.add(4);

        // Size
        System.out.println("Size of set is: " + set.size());

        // Printing all the elements of set
        System.out.println(set);

        // Search
        if (set.contains(0)) {
            System.out.println("Set contains 0");
        }

        // Delete
        set.remove(4);
        if (!set.contains(4)) {
            System.out.println("Deleted 4");
        }

        // Iterator
        Iterator it = set.iterator();

        // Printing the set using iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
