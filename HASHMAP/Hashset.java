package HASHMAP;
import java.util.HashSet;

import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);     

        //search

        if(set.contains(1)) {
            System.out.println("1 is present in the set");
        } else {
            System.out.println("1 is not present in the set");
        }

        //remove
        set.remove(1);

        //size
        System.out.println("Size of the set: " + set.size());

        System.out.println(set);

        // Iterate through the set
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }



        
    }
}
