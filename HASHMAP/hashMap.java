package HASHMAP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        // Adding elements to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Searching for an element
        if (map.containsKey(1)) {
            System.out.println("Key 1 is present in the map with value: " + map.get(1));
        } else {
            System.out.println("Key 1 is not present in the map");
        }

        // Removing an element
        map.remove(1);

        // Displaying the size of the map
        System.out.println("Size of the map: " + map.size());

        // Displaying the entire map
        System.out.println(map);

        // Iterating through the map
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        int array [] ={4,9,0,3,8,2};

        for (int num : array){

            System.out.println(num + " ");
        }

        for (Map.Entry<Integer,String> e : map.entrySet()){

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        sc.close();
    }
    
}
