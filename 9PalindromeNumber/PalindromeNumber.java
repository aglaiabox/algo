import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(123, 121, 1, 0, -121,
                Integer.MAX_VALUE, Integer.MIN_VALUE));

        for (int x:
             list) {
            System.out.println(x + " - "+isPalindrome(x));
        }

    }

    public static boolean isPalindrome(int x) {
        if (x<0) return false;

        ArrayList<Integer> digits = new ArrayList<>();
        int temp = x;
        while (temp>0){
            digits.add(temp % 10);
            temp /= 10;
        }

        for (int i = 0, j = digits.size()-1; i < j; i++, j--) {
            if (digits.get(i) != digits.get(j)) return false;
        }

        return true;

    }
}
