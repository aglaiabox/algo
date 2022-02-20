import java.awt.*;
import java.util.*;

public class ZigzagConversion {
    static int o = 0;

    public static void main(String[] args) {

        String s = "PINALSIGYAH";
        int numRows = 4;

        System.out.println(convert(s, numRows));

        System.out.println(convert(s, numRows).equals("PINALSIGYAHRPI"));

        System.out.println(o);


    }

    public static String convert(String s, int numRows) {
        // 1 часть получаем "схемку" как будем раскладывать циферки
        Map<Integer, LinkedList<Integer>> patterns = new HashMap<>();
        StringBuilder sb = new StringBuilder();

//        int [] pattern = new int[s.length()];
        int num = 1;
        boolean moveUp = true;
        for (int i = 0; i < s.length(); i++) {

            if (num == numRows) moveUp = false;
            if (num == 1) moveUp = true;

            o++;
            if (!patterns.containsKey(num)) {
                patterns.put(num, new LinkedList<>(Arrays.asList(i)));
            } else {
                patterns.get(num).add(i);
            }

//            pattern[i] = num;
            System.out.print(num + " "+s.charAt(i)+"; " );

            if (moveUp){
                num++;
            } else {
                num--;
            }
        }


        for(Integer key
                : patterns.keySet()) {
            for (int index:
                    patterns.get(key)) {
                o++;
                sb.append(s.charAt(index));
            }
        }

        return sb.toString();



    }
}
