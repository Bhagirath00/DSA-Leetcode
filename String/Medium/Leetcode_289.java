class Solution {
  public void gameOfLife(int[][] board) {
    int n = board.length;
    int m = board[0].length;
    int[][] grid = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int current = board[i][j];
        int countOnes = 0;
        if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1)
          countOnes++;
        if (i - 1 >= 0 && board[i - 1][j] == 1)
          countOnes++;
        if (i - 1 >= 0 && j + 1 < m && board[i - 1][j + 1] == 1)
          countOnes++;
        if (j - 1 >= 0 && board[i][j - 1] == 1)
          countOnes++;
        if (j + 1 < m && board[i][j + 1] == 1)
          countOnes++;
        if (i + 1 < n && j - 1 >= 0 && board[i + 1][j - 1] == 1)
          countOnes++;
        if (i + 1 < n && board[i + 1][j] == 1)
          countOnes++;
        if (i + 1 < n && j + 1 < m && board[i + 1][j + 1] == 1)
          countOnes++;
        if (current == 1) {
          if (countOnes < 2 || countOnes > 3) {
            grid[i][j] = 0;
          } else {
            grid[i][j] = 1;
          }
        } else {
          if (countOnes == 3) {
            grid[i][j] = 1;
          }
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        board[i][j] = grid[i][j];
      }
    }
    return;
  }
}