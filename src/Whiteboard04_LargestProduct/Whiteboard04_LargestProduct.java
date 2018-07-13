package Whiteboard04_LargestProduct;

import java.util.Collections;
import java.util.HashSet;

public class Whiteboard04_LargestProduct {
    public static void main(String[] args) {
    }

    public static int LargestProduct(int[][] arr) {
        //  Put all the values into a hashet.
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 1;

        //  Checks everything except the bottom rows.
        while (i < arr.length-1) {
            //Checks the interior
            while (j < arr[i].length - 1) {
                int val = arr[i][j];
                set.add(val * arr[i][j + 1]);
                set.add(val * arr[i + 1][j + 1]);
                set.add(val * arr[i + 1][j]);
                set.add(val * arr[i + 1][j - 1]);
                j++;
            }

            //Checks the far right
            j = arr[i].length-1;
            int val = arr[i][j];
            set.add(val * arr[i+1][j]);
            set.add(val * arr[i+1][j-1]);

            //checks the far left
            j=0;
            val = arr[i][j];
            set.add(val * arr[i][j+1]);
            set.add(val * arr[i+1][j]);
            set.add(val * arr[i+1][j+1]);

            j = 1;
            i++;
        }

        //Checks the bottom
        j=0;
        i= arr.length-1;
        while (j<arr[i].length-1){
            set.add(arr[i][j]*arr[i][j+1]);
            j++;
        }

        return Collections.max(set);
    }
}
