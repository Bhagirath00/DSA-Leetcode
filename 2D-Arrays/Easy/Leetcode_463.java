class Solution {
  public int islandPerimeter(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;

    int count = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == 0)
          continue;
        if (i == 0 || grid[i - 1][j] == 0)
          count++;
        if (i == rows - 1 || grid[i + 1][j] == 0)
          count++;
        if (j == 0 || grid[i][j - 1] == 0)
          count++;
        if (j == cols - 1 || grid[i][j + 1] == 0)
          count++;
      }
    }
    return count;
  }
}