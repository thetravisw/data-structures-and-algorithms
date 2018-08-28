package OldStuff;

import java.lang.ref.ReferenceQueue;

public class Whiteboard05_Array_rotate {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4,5},{4,5,6,1,2},{7,8,9,0,1},{7,2,5,9,3},{2,7,4,5,3}};
        RotateArray(test);
    }


    public static int[][] RotateArray(int[][] arr) {
        int[][] results = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                results[j][arr.length-1-i] = arr[i][j];
            }
        }

        return results;
    }
}