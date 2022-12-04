

public class ValidSudoku {
    public static void main(String[] args) {

        String[][] arr = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        char [][] arrChars = new char [arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                char [] a = arr[i][j].toCharArray();
                arrChars[i][j] = a[0];
            }
        }

        for (int i = 0; i < arrChars.length; i++) {
            for (int j = 0; j < arrChars[0].length; j++) {
                System.out.print(arrChars[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(isValidSudoku(arrChars));



    }

    public static boolean isValidSudoku(char[][] board) {

        int size = 9;

        boolean [][] rows = new boolean[size][size];
        boolean [][] columns = new boolean[size][size];
        boolean [][] sunCub = new boolean[size][size];

        // test rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char ch = board[i][j];
//                System.out.print(ch+"=");
                if (Character.isDigit(ch)){
                    int value = Character.digit(ch, 10);
                    if (rows[i][(value-1)]) return false;
                    rows[i][(value-1)] = true;

                    if (columns[j][(value-1)]) return false;
                    columns[j][(value-1)] = true;

                    int numberOfSunCub = getNumberOfSunCub(i, j);
                    if (sunCub[numberOfSunCub][(value-1)]) return false;
                    sunCub[numberOfSunCub][(value-1)] = true;

//                    System.out.print(" true ");
                } else {
//                    System.out.print(" false ");
                }

            }
//            System.out.println();
        }

        return true;
    }


    static int getNumberOfSunCub(int i, int j) {
        if (i<3 && j<3) return 0;
        else if (i>=3 && i<6 && j<3) return 1;
        else if (i>=6 && i<9 && j<3) return 2;
        else if (i<3 && j>=3 && j<6) return 3;
        else if (i>=3 && i<6 && j>=3 && j<6) return 4;
        else if (i>=6 && i<9 && j>=3 && j<6) return 5;
        else if (i<3 && j>=6) return 6;
        else if (i>=3 && i<6 && j>=6) return 7;
        else if (i>=6 && i<9 && j>=6) return 8;
        else return 9;
    }


}
