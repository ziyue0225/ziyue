public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int [][]result = new int [m + 2][n + 2];
        if (board == null || board.length == 0 || board[0].length== 0) {
            return;
        } 
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                result[i][j] = board[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int sum = result[i - 1][j - 1] + result[i - 1][j] + result[i - 1][j + 1] + result[i][j - 1] + result[i][j + 1] + result[i + 1][j - 1] + result[i + 1][j] + result[i + 1][j + 1];
                if (sum < 2) {
                    board[i - 1][j - 1] = 0;
                }
                if (sum > 3) {
                    board[i - 1][j - 1] = 0;
                }
                if (sum == 3) {
                    board[i - 1][j - 1] = 1;
                }
            }
        }
    } 
}