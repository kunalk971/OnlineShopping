package Array;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {3, 9, 0, 5, 8, 7, 0};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        // Print frequencies
        for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}
//frequency
