public class IntegerToRomanSimpleCode {

    public static void main(String[] args) {
        System.out.println("1994, MCMXCIV" + " - "+intToRoman(1994));
        System.out.println("1001, MI" + " - "+intToRoman(1001));
        System.out.println("1000, M" + " - "+intToRoman(1000));

        System.out.println("III" + " - "+intToRoman(3));
        System.out.println("LVIII" + " - "+intToRoman(58));
        System.out.println("MCMXCIV" + " - "+intToRoman(1994));
    }


    /*
the intituion is very simple just collect all number at respective position and then
just collect the value from the array and add it

example num = 2498

1000thposition = 2 - MM
100thposition =  4 - CD
10thpositon = 9  - XC
unitposition = 8 - VIII

for 1000th positon just run a forloop and add 'M' for each iteration
for the above example it will add "MM"

just simply collect the symbol from the respective array and add it in the ans

*/


        public static String intToRoman(int num) {

            StringBuilder ans = new StringBuilder();

            //Store symbol accoring to the index
            String[] hundredth = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String[] tenth = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
            String[] unitth = {"","I","II","III","IV","V","VI","VII","VIII","IX"};


            int th1000 = num / 1000;          //1000th position
            int th100 = (num % 1000) / 100;   //100th position
            int th10 = (num % 100) / 10;      //10th position
            int th = num % 10;                // unti position


            //just add m according to the 1000th number
            // means if the number is 2256  then just m 2 times
            for(int i = th1000 ; i > 0;i--){
                ans.append("M");
            }
            //if the above postion variable have some value then just add the value if not then empty string
            ans.append(hundredth[th100]);
            ans.append(tenth[th10]);
            ans.append(unitth[th]);


            return ans.toString();
        }
}
