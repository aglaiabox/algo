import java.util.ArrayList;
import java.util.List;

public class EquelsTwoStrings {

        public static void main(String[] args) {
        //
        String [] arrayOfS = {"abc","a", "a", "aa", "aaa", "ab", "mnaaaaa", "abc", "aaaaa", "abcdefjabcdefgabcdefjabcdefg"};
        String [] arrayOfP = {"abc", "a", "*", "*.", "a*", "a.", "mna*", "am*bc", "", "abc*cdc*efj*jabc***cdem*fgabn*cdefjabcdefg" };

        for (int i = 0; i < arrayOfS.length; i++) {
//            System.out.println(arrayOfS[i] +" "+arrayOfP[i]+" "+isMatch(arrayOfS[i],arrayOfP[i] ));
        }

        System.out.println(isMatch("abcdefjabcdefgabcdefjabcdefg", "abc*cdc*efj*jabc***cdem*fgabn*cdefjabcdefg"));

        }



        public static boolean isMatch(String s, String p) {

            boolean [] usedChars = new boolean[p.length()];

            char sChar;
            char pChar;
            char lastPChar;


            for (int i = 0, j=0; i < s.length(); i++) {
                sChar = s.charAt(i);
                pChar = p.charAt(j);

                char nextLetterP = '?';
                int indexNextLetterP;
                char previousLetterP = pChar;
                int previousNextLetterP;

                boolean lettersBeforeStarisEquals = false;


                // вариант 1 они равны
                if (equalsTwoChars(sChar, pChar)) {
                    usedChars[j] = true;
                    j++;
                }

                // вариант 2 они не равны
                // тогда проверяем, это буква или звездочка
                else {
                    // попробуем в лоб
                    if (p.charAt(j+1) == '*'){

                    }





                    // так не получается
                    if (pChar != '*'){ // te isAlphabet
                        lettersBeforeStarisEquals = false;
                        // если это буква, то проверяем следующую букву.
                        // если тоже не звездочка - проверка провалена
                        if (p.charAt(j+1) != '*') {
                            return false;
                        } else {
                            // если звездочка - то у нас есть последняя правильная буква
                            previousLetterP = pChar;
                            previousNextLetterP = j;
                        }
                    } else {
                        // если это звездочка - то записываем предыдущую в последнюю букву
                        lettersBeforeStarisEquals = true;
                        previousLetterP = p.charAt(j-1);
                        previousNextLetterP = j-1;
                    }

                    // теперь ищем следующую букву
                    for (int k = j+1; k < p.length(); k++) {
                        nextLetterP = p.charAt(k);
                        if (nextLetterP != '*') {
                            indexNextLetterP = k;
                            break;
                        }
                    }
                    // у нас есть предыдущая буква и следующая буква и их индексы
                    // если следующей буквы не случилось, то она равна звездочке

                    if (!lettersBeforeStarisEquals) {
                        if (nextLetterP == s.charAt(i+1)) {
//                            j = indexNextLetterP+1;
                            i++;
                        }
                    }

                }
            }


            return true;
        }

        private static boolean equalsTwoChars (char sChar, char pChar){
            if (sChar == pChar || pChar == '.') return true;
            return false;
        }
}


//
//                char pLastLetter;
//                char pnextLetter;
//                boolean pLastIsAnyLetter = false;
//
//                // 1 option
//
//
//
//                if (j!=0 && pChar=='*'){
//
//                    if (pLastIsAnyLetter || sChar == pLastLetter) {
//
//                    }
//
//                    // check next
//                    for (int k = j; k < p.length(); k++) {
//                        char pNext =p.charAt(k);
//                        if (Character.isAlphabetic(pNext)) {
//                            pnextLetter = pNext;
//                            j=k;
//                            k=p.length();
//                        } else if (pNext =='.'){
//                            j=k;
//                            k=p.length();
//                        }
//                    }
//
//                }
//
//                // 2 option
//                else if (pChar=='.'){
//
//                }
//
//                // 3 option
//                else if (Character.isAlphabetic(pChar)){
//
//                }
