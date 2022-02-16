import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "jgjg";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mapa = new HashMap<>();
        int maxSize = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if(mapa.containsKey(s.charAt(i))){
                j = Math.max(mapa.get( s.charAt(i) ), j);
            }
            maxSize = Math.max((i-j+1), maxSize);
            mapa.put(s.charAt(i), i+1);
            System.out.println(mapa);
        }

        return maxSize;
    }


}