import static org.junit.Assert.*;

public class Whiteboard02_insertShiftArrayTest {
    public static void main(String[] args) {
        int[]test = {1,2,3,4,6,7,8,9};
        insertShiftArray(test,5);
    }

    public static int[] insertShiftArray (int[] arr, int num) {

        int size = arr.length;
        int middle = (int)Math.ceil(arr.length/2);
        int[] output = new int [size+1];

        for(int i=0; i < middle; i++) {
            output[i] =arr[i];
        }
        output[middle]=num;
        for(int i = middle+1; i < arr.length+1; i++){
            output[i]=arr[i-1];
        }

        return output;

    }
}

