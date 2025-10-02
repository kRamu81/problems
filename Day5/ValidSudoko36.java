package Day5;
import java.util.*;

public class ValidSudoko36 {
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
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char c = board[i][j];
                if(!set.add(c+"@row"+i) || !set.add(c+"@col"+j) || !set.add(c+"@box"+i/3+j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
