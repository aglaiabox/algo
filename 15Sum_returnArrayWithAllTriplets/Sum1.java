import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum1 {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));



    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        ArrayList<Integer> negList = new ArrayList<>();
        ArrayList<Integer> posList = new ArrayList<>();
        boolean isContainZero = false;
        int indexZiro = 0;


        // сделать так, чтобы он искал 0 не сначала, а с середины
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                indexZiro++;
            } else if (nums[i] == 0){
                isContainZero = true;
                indexZiro++;
            } else {
                break;
            }
        }

        if (isContainZero){
            int lastPair = 0;
            for (int i = 0, j = nums.length-1; i < j; ) {
                int a = Math.abs(nums[i]), b = nums[j];
                if (a == b) {
                    if (a != lastPair)
                        list.add(new ArrayList<>(Arrays.asList(-a, 0, b)));
                    lastPair = a;
                    i++; j++;
                } else if (a!=0 && b!=0) {
                    if (a>b) i++;
                    if (b>a) j--;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < indexZiro; i++) {
            for (int j = 1; j < indexZiro; j++) {
                int a = nums[i];
                int b = nums[j];

                int c = findEquals (-(a+b), indexZiro, nums.length, nums);
                if (c !=0) list.add(new ArrayList<>(Arrays.asList(a, b, c)));
            }
        }

        for (int i = indexZiro; i < nums.length; i++) {
            for (int j = indexZiro+1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];

                int c = findEquals (-(a+b), 0, indexZiro, nums);
                if (c !=0) list.add(new ArrayList<>(Arrays.asList(a, b, c)));
            }
        }




        return list;
    }

    private static int findEquals(int sum, int start, int end, int[] nums) {
        if (end-start < 1){
            return 0;
        }
        int middle = end - ((end-start)/2);
        if (sum == nums[middle]) {
            return nums[middle];
        } else if (sum<nums[middle]) {
            return findEquals(sum, start, middle, nums);
        } else {
            return findEquals(sum, middle, end, nums);
        }
    }

}
