package SearchInsertPosition;

//You must write an algorithm with O(log n) runtime complexity.

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 41.7 MB, less than 95.00% of Java online submissions for Search Insert Position.

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1};
        int target = 2;

        System.out.println(searchInsertPosition(nums, target));

    }

    private static int searchInsertPosition(int[] nums, int target) {
        return getHalf(nums, 0, nums.length, target);
    }

    private static int getHalf (int[] nums, int low, int hight, int target){
        if (low >= hight-1) {
            if (nums[low]>=target) return low;
            return low+1;
        }

        int middle = low + (hight-low)/2;
        int border = nums[middle];
        if (target > border) {
            return getHalf(nums, middle, hight, target);
        } else if (target< border) {
            return getHalf(nums, low, middle, target);
        } else {
            return middle;
        }
    }


}
