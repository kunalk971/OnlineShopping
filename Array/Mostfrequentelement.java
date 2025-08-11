package Array;
import java.util.HashMap;
public class Mostfrequentelement {
    
    static int mostFrequent (int[] arr){
        int n = arr.length;

        HashMap<Integer,Integer> f = new HashMap<>();
        for (int i = 0 ; i < n; i++)
            f.put(arr[i],f.getOrDefault(arr[i],0)+1);
        
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0 ; i< n; i++)
           hashmap.put(arr[i],hashmap.getOrDefault(arr[i],0)+1);
            

         System.out.println(hashmap);
    int maxCount = 0,res = -1;
    for (var entry : f.entrySet()){
        int val = entry.getKey(),cnt = entry.getValue();
        if (maxCount < cnt || (cnt == maxCount && val > res)){
            res = val;
            maxCount = cnt;
        }//comment
    }
    return res;
    }
    public static void main(String[] args){
        int [] arr = {3,4,9,0,2,2};
        System.out.println(mostFrequent(arr));
    }
}


