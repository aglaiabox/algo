public class RemoveElement {

    public static void main(String[] args) {
        int [] nums = {7,1,8,1,1,2,2,3,1,4};
        int num = 1;
        nums = removeElements(nums, 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

    }

    private static int[] removeElements(int[] nums, int num) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] != num){
                nums[c] = nums[i];
                c++;
            }

            System.out.print("i = "+i + ",c = "+c+", nums = ");
            for (int a:
                 nums) {
                System.out.print(a + ", ");
            }
            System.out.println();

        }
        for (int i = c; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }

}
