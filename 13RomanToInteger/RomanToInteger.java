import java.util.ArrayList;
import java.util.Arrays;

public class RomanToInteger {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("III", "LVIII", "MCMXCIV"));

        for (String s:
                list) {
            System.out.println(s + " - "+romanToInt(s));
        }

    }

    // s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    public static int romanToInt(String s) {
        int res = 0;
        int previous = 0;
        int next = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            previous = next;
            next = romanCharToInt(s.charAt(i));

            if (next >= previous) {
                res += next;
            } else {
                res -= next;
            }
        }

        return res;
    }

    private static int romanCharToInt (char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

}

// Runtime: 6 ms, faster than 71.72% of Java online submissions for Roman to Integer.
//Memory Usage: 44.5 MB, less than 39.26% of Java online submissions for Roman to Integer.