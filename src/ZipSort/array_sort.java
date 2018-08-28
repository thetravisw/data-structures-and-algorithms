package ZipSort;

public class array_sort {

    public static void main(String[] args) {
        int[] sort = {-2,0,2,2,2,15,6};

        int[] results = sort(sort);
        printArray(results);
    }

    public static int[] sort (int[] arr){
        int size = arr.length;
        int[] results = new int[size];
        int half = (int)Math.floor(size/2);
        if (size < 2 ) return  arr;

        int[] left = new int[half];
        int[] right = new int[(int)Math.ceil((double)size/2)];
        for (int i = 0; i < half; i++){
            left[i] = arr[i];
            right [i] = arr [half+i];
        }
        if (size % 2 == 1) right[half] = arr[size-1];

        left = sort(left);
        right = sort(right);

        results = stitch (left, right);
        return results;
    }

    private static int[] stitch (int[] l, int [] r){
        int size = l.length + r.length;
        int[] results = new int[size];
        int lpointer=0;
        int rpointer=0;
        for (int i = 0; i < size; i++){
            if (rpointer==r.length || (lpointer != l.length && l[lpointer] < r[rpointer])){
                results[i] = l[lpointer];
                lpointer++;
            } else {
                results[i] = r[rpointer];
                rpointer++;
            }
        }
    return results;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
