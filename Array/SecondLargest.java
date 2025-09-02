package Array;
public class SecondLargest{
public static int SecondLargest(int arr[]){

   int largest = -1;
   int SecondLargest = -1;
    int k = arr.length-1;
    for (int i=0; i<arr.length;i++){

        if(arr[i]>largest){
            SecondLargest = largest;
            largest = arr[i];
        }
        else{
            if(arr[i] != largest && arr[i]>SecondLargest){
                SecondLargest = arr[i];
            }
        }
        
    } 
     return SecondLargest;
}
    public static void main(String[] args){
        int arr[] = {4,9,8,3,4,9,2,9};
        SecondLargest(arr);
        
    }
}
