public class ReverseInteger4 {
//    static int o = 0;

    public static void main(String[] args) {

//        int x = -2147483648;
//        int x = 2147483647;
//        int x = 321;
        int x = -1463847412;
//        int x = -1;

        System.out.println(reverse (x));
//        System.out.println(o);


    }

    public static int reverse(int x) {


        boolean isNegative = x<0 ? true :false;

        if (x==-2147483648) return 0;
        String s = Integer.toString(Math.abs(x));
        char[] chars = new char[s.length()];

        for (int i=s.length(); i >0 ; i--) {
            chars [s.length()-i] = s.charAt(i-1);
        }
        String resStr = String.valueOf(chars);
        int resInt = 0;
        try {
            resInt = Integer.parseInt(resStr);
        } catch (Exception e){
            return 0;
        }
        if (isNegative){
            if (resInt>2147483647) return 0;
            resInt = -resInt;
        } else {
            if (resInt>2147483647) return 0;
        }
        return resInt;

    }
}

// Разбираем как Стринг , собираем как чар массив и только потом переводим в страинг, а потом в число

// Success
//Details
//Runtime: 3 ms, faster than 33.48% of Java online submissions for Reverse Integer.
//Memory Usage: 41.6 MB, less than 15.56% of Java online submissions for Reverse Integer.

