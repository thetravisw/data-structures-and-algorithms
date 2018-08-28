package OldStuff;

public class Whiteboard_05B_NthFib {
    public static void main(String[] args) {
        iterative(8);
        recursive(8);
    }

    public static int iterative(int num) {
        if (num == 1 || num == 2) return 1;
        int[] results = new int[num];
        results[0] = 1;
        results[1] = 1;
        for (int i = 2; i < num; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }

        System.out.println(results[num-1]);
        return results[num -1];
    }

    public static int recursive (int num){
        if (num == 1 || num == 2) return 1;
        int a =1;
        int b =1;
        for (int i=2; i < num; i++){
            b +=a;
            a = b-a;
        }

        System.out.println(b);
        return b;
    }
}