import java.util.ArrayList;
import java.util.List;

// 10:40 - 10 min
// 11:36
public class StringToInteger {

    public static void main(String[] args) {
        // "42", "   -42",
        ArrayList<String> listOfS = new ArrayList<>(List.of("4193 with words", "0", "asd", "", " "));

        for (String s:
             listOfS) {
            System.out.println(myAtoi(s));
        }

    }


    public static int myAtoi(String s) {
        boolean numberStarted = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (numberStarted){
                if (Character.isDigit(ch)) {
                    stringBuilder.append(ch);
                } else {
                    i=s.length();
                }
            } else {
                if (ch=='-' || Character.isDigit(ch)) {
                    stringBuilder.append(ch);
                    numberStarted = true;
                }
            }
        }
        long res = 0;
        try {
            res = Integer.parseInt(stringBuilder.toString());
        } catch (Exception e){

        }
        if (res>2147483647) return 2147483647;
        if (res<-2147483648) return -2147483648;
        return (int) res;
    }
}

// Step 1: "   -42" (leading whitespace is read and ignored)
//            ^
//Step 2: "   -42" ('-' is read, so the result should be negative)
//             ^
//Step 3: "   -42" ("42" is read in)
//               ^
//The parsed integer is -42.
//Since -42 is in the range [-231, 231 - 1], the final result is -42.