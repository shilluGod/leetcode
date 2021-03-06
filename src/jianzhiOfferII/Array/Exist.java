package jianzhiOfferII.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/8 14:37
 */
public class Exist {

    public boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        // two-level for loop is search start state
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,words,i,j,0))
                    return true;
            }
        }
        return false;
    }

    // recursion
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        // return error
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
            return false;
        // return true
        if (k == word.length - 1)
            return true;
        // set board[i][j] null
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        // restore value of board
        board[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        Exist exist = new Exist();
        System.out.println(exist.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCDE"));
    }
}
