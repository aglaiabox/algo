public class LongestCommonPrefix2 {
    static int o;       // = 32

    public static void main(String[] args) {
        String [] strs = {"flowing","flowing","flowing","flowing"};
        System.out.println("Str: "+longestCommonPrefix(strs));
        System.out.println(o);
    }

    public static String longestCommonPrefix(String[] strs) {

        int minLen = Integer.MAX_VALUE;

        for (String s:
             strs) {
            o++;
            minLen = Math.min(s.length(), minLen);
        }
        int low = 0;

        for (int i = 0; i < minLen; i++) {
            o++;
            if (isCommonPrefix(strs, i)) low++;
        }

        return strs[0].substring(0,low);
    }

    public static boolean isCommonPrefix(String[] strs, int index) {
        char ch = strs[0].charAt(index);
        for (int i = 1; i < strs.length; i++) {
            o++;
            if (strs[i].charAt(index) != ch) return false;
        }
        return true;
    }


}
