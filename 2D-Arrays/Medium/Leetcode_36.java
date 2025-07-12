class Solution {
  public boolean isValidSudoku(char[][] board) {
    boolean[][] rows = new boolean[9][10];
    boolean[][] cols = new boolean[9][10];
    boolean[][][] boxes = new boolean[3][3][10];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.')
          continue;
        if (rows[i][board[i][j] - '0'] || cols[j][board[i][j] - '0'] || boxes[i / 3][j / 3][board[i][j] - '0']) {
          return false;
        }
        rows[i][board[i][j] - '0'] = true;
        cols[j][board[i][j] - '0'] = true;
        boxes[i / 3][j / 3][board[i][j] - '0'] = true;
      }
    }
    return true;
  }
}