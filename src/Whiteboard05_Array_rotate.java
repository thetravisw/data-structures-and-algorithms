import java.lang.ref.ReferenceQueue;

public class Whiteboard05_Array_rotate {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,},{4,5,6},{7,8,9}};
        RotateArray(test);
    }


    public static int[][] RotateArray(int[][] arr) {
        int[][] results = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                results[j][2-i] = arr[i][j];
            }
        }

        return results;
    }
}