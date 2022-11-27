public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length<2) return nums.length;
        int count = 1;

        int a1 = nums[0];

        for (int i = 1, j = 1; i < nums.length; i++) {
            int a2 = nums[i];

            if (a1 != a2) {
                count++;
            }
            a1 = a2;
        }


        return count;
    }
}
