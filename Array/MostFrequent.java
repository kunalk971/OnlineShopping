package Array;

// Java program to find the most frequent element in an array.
import java.util.HashMap;

class MostFrequent {

    static int mostFreqEle(int[] arr) {
        int n = arr.length;
        
        // Insert all elements in hash map.
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++)
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

        // find the max frequency
        int maxCnt = 0, res = -1;
        for (var entry : freq.entrySet()) {
            int val = entry.getKey(), cnt = entry.getValue();
            if (maxCnt < cnt || (cnt == maxCnt && val > res)) {
                res = val;
                maxCnt = cnt;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        System.out.println(mostFreqEle(arr));
        System.out.println(hashmap);
    }
}
