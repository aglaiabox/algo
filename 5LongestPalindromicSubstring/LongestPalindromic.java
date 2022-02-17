// Given a string s, return the longest palindromic substring in s.

//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

import java.util.Map;

public class LongestPalindromic {
    static int o;

    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        System.out.println(longestPalindrome(s));
        System.out.println(o);
    }

    public static String longestPalindrome(String s) {
        String maxPolindrom = "", polindrom = "";
        int begin, end;
        boolean toCont;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 2; j++) {
                begin = i; end = i+j;

                if (end<s.length()) o=o+2;  // счетчик

                if (end<s.length() && s.charAt(begin) == s.charAt(end) ){
                    toCont = true;

                    while (toCont){
                        if (begin>0 && end<(s.length()-1)) o=o+2;      // счетчик
                        if (begin>0 && end<(s.length()-1) && s.charAt(begin-1) == s.charAt(end+1)){
                            --begin;
                            ++end;
                        } else {
                            toCont = false;
                        }
                    }

                    polindrom = s.substring(begin, end+1);

//                    System.out.println("begin "+begin+" end "+end+" polindrom "+polindrom);
                    if (polindrom.length() > maxPolindrom.length()) maxPolindrom = polindrom;
                }

            }

        }

        return maxPolindrom;
    }
}
