package Array;

class gfgthirdlargest {
    public int thirdLargest(int[] arr) {
        if (arr == null || arr.length < 3) return -1; // adjust per problem spec

        int largest = Integer.MIN_VALUE;
        int second  = Integer.MIN_VALUE;
        int third   = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x >= largest) {          // allow duplicates
                third = second;
                second = largest;
                largest = x;
            } else if (x >= second) {    // allow duplicates
                third = second;
                second = x;
            } else if (x >= third) {     // allow duplicates
                third = x;
            }
        }
        return third;
    }
}

