import java.lang.reflect.Array;

public class WB01_Array_Reverse {
    public static void main(String[] args) {

}

    public static int[] reverseArray (int[] arr) {

        int size = arr.length;
        int[] output = new int [size];
        int index = size-1;

        for (int i =0; i < size; i++){
            output[i] = arr[index];
            index--;
        }

        return output;
    }
}

