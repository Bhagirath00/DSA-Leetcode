class Solution {
  public boolean checkXMatrix(int[][] grid) {
    int n = grid.length;
    for (int i = 0; i < n; i++) {
      if (grid[i][i] == 0) {
        return false;
      }
      if (grid[i][n - i - 1] == 0) {
        return false;
      }
    }
    for (int i = 0; i < n; i++) {
      grid[i][i] = 0;
      grid[i][n - i - 1] = 0;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }
}

// Beats 100% of Java submissions

class Solution {
  public boolean checkXMatrix(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (i == j || i + j == grid.length - 1) {
          if (grid[i][j] == 0) {
            return false;
          }
        } else if (grid[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }
}