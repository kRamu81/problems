package Day5;
import java.util.*;

public class ValidSudoko {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValid(board));
    }

    public static boolean isValid(char[][] board){
        // rows
        for(int i = 0; i < 9; i++){
            Set<Character> row = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(!row.add(board[i][j])) return false;
            }
        }

        // cols
        for(int i = 0; i < 9; i++){
            Set<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                if(!col.add(board[j][i])) return false;
            }
        }

        // 3x3 sub-boxes
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                Set<Character> box = new HashSet<>();
                for(int p = i; p < i + 3; p++){
                    for(int q = j; q < j + 3; q++){
                        if(board[p][q] == '.') continue;
                        if(!box.add(board[p][q])) return false;
                    }
                }
            }
        }

        return true;
    }
}
/*
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */

/*
Rows Check:

1. Loop through each row (i = 0 to 8)
2. For each row, create a new empty Set<Character> to store unique elements
3. Loop through each column in the row (j = 0 to 8)
4. If the current cell is '.', skip it (empty cell)
5. Try to add the character to the set
   - If add() returns false → duplicate exists → row is invalid → return false
6. If no duplicates found, continue to next row
*/

/*
Columns Check:

1. Loop through each column (i = 0 to 8)
2. For each column, create a new empty Set<Character> to store unique elements
3. Loop through each row in the column (j = 0 to 8)
4. If the current cell is '.', skip it (empty cell)
5. Try to add the character to the set
   - If add() returns false → duplicate exists → column is invalid → return false
6. If no duplicates found, continue to next column
*/

/*
3x3 Sub-Boxes Check:

1. Loop through each 3x3 sub-box starting points
   - Outer loops: i = 0,3,6 (rows), j = 0,3,6 (columns)
2. For each sub-box, create a new empty Set<Character> to store unique elements
3. Loop through all 9 cells inside the sub-box
   - p = i to i+2 (rows), q = j to j+2 (columns)
4. If the current cell is '.', skip it (empty cell)
5. Try to add the character to the set
   - If add() returns false → duplicate exists → sub-box is invalid → return false
6. If no duplicates found, continue to next sub-box
*/
