public class LongestCommonPrefix {
    static int o;   // =24

    public static void main(String[] args) {
        String [] strs = {"flowing","flowing","flowing","flowing"};
        System.out.println("Str: "+longestCommonPrefix(strs));
        System.out.println(o);
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            o++;
            prefix = longestCommonPrefix(strs[i], prefix);
            if (prefix.length()==0) break;
        }

        return prefix;
    }

    private static String longestCommonPrefix (String s1, String s2){
        int i;
        for ( i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            o++;
            if (s1.charAt(i) != s2.charAt(i)) break;
        }
        return s1.substring(0,i);
    }
}

// Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.
// Space complexity : O(1)O(1). We only used constant extra space.