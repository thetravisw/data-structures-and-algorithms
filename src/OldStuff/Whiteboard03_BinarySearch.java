package OldStuff;

import java.lang.reflect.Array;

public class Whiteboard03_BinarySearch {
    public static void main(String[] args) {

    }

    public static int BinarySearch (int[] arr, int target) {
        int output =0;
        int leftSide=0;
        int strongSide=arr.length-1;  //  Right side.   It's a Remember the Titans reference.
        int middle;

        while (leftSide <= strongSide){
            middle = (int)Math.floor((leftSide+strongSide)/2);
            if (arr[middle] == target) return middle;
            if (arr[middle] > target) strongSide=middle-1;
            if (arr[middle] < target) leftSide = middle+1;
        }
        return -1;
    }
}
