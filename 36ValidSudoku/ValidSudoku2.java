
// not mine but better
public class ValidSudoku2 {
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
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '.') continue;

                for(int z = i/3*3 ; z < i/3*3+3 ; z++){

                    for(int y = j/3*3 ; y < j/3*3+3 ; y++){

                        if(board[z][y] == board[i][j] && z!=i && y!=j) return false;

                    }

                }

                for (int k = j+1; k < board.length; k++) {

                    if (board[i][j] == board[i][k] ) return false;
                }

                for (int k = i+1; k < board.length; k++) {

                    if (board[i][j] == board[k][j]) return false;
                }


            }
        }

        return true;
    }


}
