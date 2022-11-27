import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.util.stream.Collectors.toList;

public class Sum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));



    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));


        AtomicBoolean isContainZero = new AtomicBoolean(false);
        int[] index = {0};
        List<Integer> sortedNumbers = Arrays.stream(nums)
                .sorted()
                .peek(number -> {
                    if (number < 0) {
                        index[0]++;
                    } else if(number == 0){
                        isContainZero.set(true);
                    }
                }).boxed()
                .collect(toList());
        System.out.println(sortedNumbers.subList(0, index[0]));
        System.out.println(sortedNumbers.subList(index[0], sortedNumbers.size()));


        return list;
    }

}
