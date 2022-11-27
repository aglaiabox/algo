public class ValidParentheses {
    public static void main(String[] args) {

        String[] strings = {"()[]{}", "()", "(]", "(", "({})"};

        for (String s:
             strings) {
            System.out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {

        return true;

    }

    private static void nnn (String s, int begin, int end){
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(0);
//            if (!isOpen(ch1))
        }
    }

    private static boolean isOpen (char ch1){
//        if (ch1 != '(' || ch1 != '{' || ch1 != '[') return false;
        return true;
    }

    private static boolean isPair (char ch1, char ch2){
        if (ch1 == '(' && ch2 == ')') return true;
        if (ch1 == '{' && ch2 == '}') return true;
        if (ch1 == '[' && ch2 == ']') return true;

        return false;
    }
}
