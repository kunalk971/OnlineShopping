package Array;

public class ThirdLargest {
    public static int thirdlargest (int arr[]){
     int largest = -1;
     int secondlargest = -1;
     int thirdlargest = -1;

     for (int i = 0; i < arr.length;i++){

        if (arr[i]>largest ){
           
            thirdlargest = secondlargest;
            secondlargest = largest;
            largest = arr[i];
        }
        else if(arr[i]< largest && arr[i] > secondlargest ){
            thirdlargest = secondlargest;
            secondlargest = arr[i];

        }
        else if ( arr[i]<secondlargest && arr[i]>thirdlargest) {
            thirdlargest = arr[i];
            
        }
     

     }
    return thirdlargest;
    }
    public static void main(String[] args) {
        int arr[] = {4,9,8,3,4,9,2,9};
        System.out.println(thirdlargest(arr));
        
    }
}
