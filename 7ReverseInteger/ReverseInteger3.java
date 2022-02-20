public class ReverseInteger3 {
//    static int o = 0;

    public static void main(String[] args) {

//        int x = -2147483648;
//        int x = 2147483647;
//        int x = 321;
//        int x = -1463847412;
        int x = -1;

        System.out.println(reverse (x));
//        System.out.println(o);


    }

    public static int reverse(int x) {


        boolean isNegative = x<0 ? true :false;

        if (x==-2147483648) return 0;
        String s = Integer.toString(Math.abs(x));
        StringBuilder sb = new StringBuilder();

        for (int i=s.length(); i >0 ; i--) {
            sb.append(s.substring(i-1,i));
        }
        String res = sb.toString();
        int resInt = 0;
        try {
            resInt = Integer.parseInt(res);
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

// Разбираем как Стринг, собираем как страинг и только потом переводим в число

// Success
//Details
//Runtime: 4 ms, faster than 19.28% of Java online submissions for Reverse Integer.
//Memory Usage: 42 MB, less than 5.20% of Java online submissions for Reverse Integer.

