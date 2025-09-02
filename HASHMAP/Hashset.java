package HASHMAP;
import java.util.HashSet;
import java.util.Iterator;


// What is a HashSet?

// A HashSet is a collection in Java (part of java.util) that:

// Stores unique elements only (no duplicates allowed).

// Is unordered (does not maintain insertion order).

// Is based on a hash table internally (uses hashing for fast lookups).

//Key Properties

// Uniqueness

// A HashSet cannot contain duplicate elements.

// If you try to add a duplicate, the add() method returns false and the element is not inserted.

// HashSet<Integer> set = new HashSet<>();
// set.add(10);
// set.add(20);
// set.add(10); // ignored, already present
// System.out.println(set); // Output: [20, 10] (only unique values)


// No guaranteed order

// Elements are stored based on their hash codes, not insertion order.

// So, when you print a HashSet, elements may appear in random order.

// HashSet<String> set = new HashSet<>();
// set.add("Apple");
// set.add("Banana");
// set.add("Mango");
// System.out.println(set); // Order is unpredictable


// If you want insertion order → use LinkedHashSet.
// If you want sorted order → use TreeSet.

// Null values

// HashSet allows only one null element.

// HashSet<String> set = new HashSet<>();
// set.add(null);
// set.add(null); // ignored
// System.out.println(set); // [null]


// Performance

// Average time complexity for add(), remove(), contains() is O(1).

// Worst case (when many hash collisions happen) is O(n).

// Backed by HashMap internally

// In fact, a HashSet is just a wrapper around a HashMap where each element is stored as a key and a dummy constant object is used as the value.

// Common Methods
// Method	Description
// add(E e)	Adds element if not already present. Returns true/false.
// remove(Object o)	Removes an element if present.
// contains(Object o)	Checks if element exists.
// isEmpty()	Returns true if empty.
// size()	Returns number of elements.
// clear()	Removes all elements.
// iterator()	Iterates through elements
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
