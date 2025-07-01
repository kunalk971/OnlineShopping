package Array;
import java.util.HashMap;
import java.util.Map;

public class MostFreq {

    public static void main(String[] args){
        int [] arr = {4,9,8,3,4,9,2,9};

        HashMap<Integer,Integer>freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num , freqMap.getOrDefault(num,0)+1);

        }
    int maxFreq = 0;
    int mostFrequent = arr[0];

    for (Map.Entry<Integer,Integer>entry : freqMap.entrySet()){
        if(entry.getValue() > maxFreq){
            maxFreq  = entry.getValue();
            mostFrequent = entry.getKey();
        }
    }
    System.out.println("Most frequent element:" + mostFrequent);
    System.out.println("Frequency:"+ maxFreq);
    System.out.println(freqMap);
    }
    
}
