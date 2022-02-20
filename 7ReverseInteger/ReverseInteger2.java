public class ReverseInteger2 {
//    static int o = 0;

    public static void main(String[] args) {

//        int x = -2147483647;
//        int x = -321;
//        int x = -1463847412;
        int x = -1;


        System.out.println(reverse (x));
//        System.out.println(o);


    }

    public static int reverse(int x) {


        boolean isNegative = x<0 ? true :false;
        int lenghtOfInt = isNegative ? Integer.toString(x).length()-1 : Integer.toString(x).length();

        long res = 0;
        int ostatok = 0;
        long n2;

        for (int i = 0, j = lenghtOfInt-1; i < lenghtOfInt; i++, j--) {
            ostatok = x%10;
            n2 = (long) Math.pow(10, j) * ostatok;
            res += n2;
            x = x/10;
        }


        if (res<-2147483648 || res>2147483647) return 0;

        return (int)res;

    }
}
// Разбираем как число, и собираем как число

// Success
//Details
//Runtime: 3 ms, faster than 33.48% of Java online submissions for Reverse Integer.
//Memory Usage: 41.5 MB, less than 18.35% of Java online submissions for Reverse Integer.
