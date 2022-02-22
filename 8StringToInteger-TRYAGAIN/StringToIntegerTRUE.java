import java.util.ArrayList;
import java.util.List;

// 10:40 - 10 min
// 11:36
public class StringToIntegerTRUE {

    public static void main(String[] args) {
        //
        ArrayList<String> listOfS = new ArrayList<>(List.of("+", "+-12", "-91283472332", "42", "   -42", "4193 with words","with words4193 ", "0", "asd", "", " "));

        for (String s:
             listOfS) {
            System.out.println(myAtoi(s));
        }

    }


    public static int myAtoi(String s) {
        if (s.length()<1) return 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){

            } else if (ch == '-' || ch == '+') {
                if (Character.isDigit(s.charAt(i+1))){
                    stringBuilder.append(ch);
                } else {
                    return 0;
                }
            }  else if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
                i++;
                for (; i <s.length(); i++) {
                    ch = s.charAt(i);
                    if (Character.isDigit(ch)) {
                        stringBuilder.append(ch);
                    } else {
                        i = s.length();
                    }
                }
            }else {
                return 0;
            }
        }

        String resStr = stringBuilder.toString();

        int res = 0;

        try {
            res = Integer.parseInt(resStr);
        } catch (NumberFormatException e){
            if (resStr.length()<1){
                return 0;
            } else if (resStr.length()<2 && resStr.charAt(0)=='-' || resStr.charAt(0)=='+' ){
                return 0;
            }else if (resStr.charAt(0)=='-') {
                return -2147483648;
            } else {
                return 2147483647;
            }
        } catch (StringIndexOutOfBoundsException e1){
            return 0;
        }

        //

        return res;
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