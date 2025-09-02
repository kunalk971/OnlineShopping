package Array;
import java.util.*;

public class duplicate {

    public static void main(String[] args) {
       int [] arr = {2,4,9,2,8,0,4};
       System.out.println("hello");
       
       HashSet<Integer> seen = new HashSet<>();
       HashSet<Integer> duplicate = new HashSet<>();

       for(int num: arr){
        if(!seen.add(num)){
            duplicate.add(num);//
        }
       }

       if(duplicate.isEmpty()){
        System.out.println("No duplicate found:");

       }
       else{
        System.out.println("Duplicate element:"+duplicate);
       }

    }
    
}
