class Solution {
  public int[][] sortMatrix(int[][] grid) {
    int n = grid.length;
    for (int col = 1; col < n - 1; col++) {
      for (int k = 1; k < n - col; k++) {
        int i = 0;
        int j = col;
        while (i < n - k && j < n - k) {
          if (grid[i][j] > grid[i + 1][j + 1]) {
            swap(grid, i, j);
          }
          i++;
          j++;
        }
      }
    }
    for (int row = 0; row < n - 1; row++) {
      for (int k = 1; k < n - row; k++) {
        int i = row;
        int j = 0;
        while (i < n - k && j < n - k) {
          if (grid[i][j] < grid[i + 1][j + 1]) {
            swap(grid, i, j);
          }
          i++;
          j++;
        }
      }
    }
    return grid;
  }

  private void swap(int[][] grid, int i, int j) {
    int temp = grid[i][j];
    grid[i][j] = grid[i + 1][j + 1];
    grid[i + 1][j + 1] = temp;
  }
}