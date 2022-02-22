import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1 <= num <= 3999
public class IntegerToRoman {
    public static void main(String[] args) {

        System.out.println("1994" + " - "+intToRoman(1994));
        System.out.println("1001" + " - "+intToRoman(1001));
        System.out.println("1000" + " - "+intToRoman(1000));

        System.out.println("III" + " - "+intToRoman(3));
        System.out.println("LVIII" + " - "+intToRoman(58));
        System.out.println("MCMXCIV" + " - "+intToRoman(1994));

}

    // s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int a4 = num / 1000;
        if (a4 >0) {
            for (int i = 0; i < a4; i++) {
                sb.append('M');
            }
            num %= 1000;
        }

        int a3 = num / 100;
        if (a3 >0) {
            sb.append(getPartOfNumber(a3,'C', 'D', 'M'));
            num %= 100;
        }

        int a2 = num / 10;
        if (a2 >0) {
            sb.append(getPartOfNumber(a2,'X', 'L', 'C'));
            num %= 10;
        }

        int a1 = num;
        if (a1 >0) {
            sb.append(getPartOfNumber(a1,'I', 'V', 'X'));
        }

        return sb.toString();
    }

    private static String getPartOfNumber (int x, char x1, char x5, char x10) {
        StringBuilder sb = new StringBuilder();
        if (0<x && x<4){
            for (int i = 0; i < x; i++) {
                sb.append(x1);
            }
        } else if ( x == 4){
            sb.append(x1);
            sb.append(x5);
        } else if ( x == 5){
            sb.append(x5);
        } else if (x>5 && x<9){
            sb.append(x5);
            for (int i = 5; i < x; i++) {
                sb.append(x1);
            }
        } else if (x == 9) {
            sb.append(x1);
            sb.append(x10);
        }
        return sb.toString();
    }
}

// Runtime: 13 ms, faster than 35.39% of Java online submissions for Integer to Roman.
// Memory Usage: 45.9 MB, less than 21.16% of Java online submissions for Integer to Roman.