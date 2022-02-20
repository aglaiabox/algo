public class ReverseInteger {
//    static int o = 0;

    public static void main(String[] args) {

        int x = -2147483648;


        System.out.println(reverse (x));
//        System.out.println(o);


    }

    public static int reverse(int x) {


        boolean isNegative = x<0 ? true :false;

        if (x==-2147483648) return 0;
        String s = Integer.toString(Math.abs(x));
        long res = 0;

        for (int i=0 ; i < s.length(); i++) {
                long num = Long.parseLong (s.substring(i,i+1));
                long n2 = (long) Math.pow(10, i) * num;
                res += n2;

        }
        if (isNegative){
            if (res>2147483647) return 0;
            res = -res;
        } else {
            if (res>2147483647) return 0;
        }
        return (int)res;

    }
}

// Разбираем как Стринг, а  собираем как число

// Success
//Details
//Runtime: 1 ms, faster than 99.40% of Java online submissions for Reverse Integer.
//Memory Usage: 39.9 MB, less than 31.53% of Java online submissions for Reverse Integer.

