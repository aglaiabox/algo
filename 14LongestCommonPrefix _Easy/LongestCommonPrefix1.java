public class LongestCommonPrefix1 {
    static int o;   //= 34

    public static void main(String[] args) {
        String [] strs = {"flowing","flowing","flowing","flowing"};
        System.out.println("Str: "+longestCommonPrefix(strs));
        System.out.println(o);

    }

    public static String longestCommonPrefix(String[] strs) {

        return longestCommonPrefix(strs, 0, strs.length-1);
    }

    public static String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            o++;
            return strs[l];
        } else {
            o+=3;
            int mid = (l+r)/2;
            String left = longestCommonPrefix(strs, l, mid);
            String right = longestCommonPrefix(strs, mid+1, r);
            return longestCommonPrefix(left, right);
        }
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

// Time complexity : O(S)O(S)
//Space complexity : O(m \cdot \log n)O(m⋅logn)
