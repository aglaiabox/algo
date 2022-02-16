public class CheckIfAllUnique {

    // O = (2n)
    // это самый оптимальный способ найти совпадения. Второй вариант - через мапу
    public static boolean isAllUnique (String s, int start, int end) {
        boolean[] allChars = new boolean[256];

        for (int i = start; i < end; i++) {
            int n = s.charAt(i);
            if (allChars[n] == true){
                return false;
            } else {
                allChars[n] = true;
            }
        }
        return true;
    }
}
