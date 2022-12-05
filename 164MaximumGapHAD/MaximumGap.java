import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {

        int[] arr ={};

        System.out.println(maxGap(arr));

    }

    public static int maxGap(int[] arr) {
        if (arr.length<1) return 0;
        Arrays.sort(arr);
        int a = arr[0];
        int gap = 0;
        for (int i = 1; i < arr.length; i++) {
            int b = arr[i];
            int c = b-a;
            if (gap<c) gap = c;
            a = b;
        }

        return gap;
    }




}
