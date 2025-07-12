class Solution {
  public int getMaximumGold(final int[][] grid) {
    final int m = grid.length, n = grid[0].length;

    int sum = 0;

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        if (grid[i][j] != 0)
          sum = Math.max(sum, helper(grid, i, j));

    return sum;
  }

  private int helper(final int[][] grid, final int i, final int j) {
    if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] == 0)
      return 0;

    final int tmp = grid[i][j];

    grid[i][j] = 0;

    final int sum = Math.max(Math.max(helper(grid, i + 1, j), helper(grid, i, j + 1)),
        Math.max(helper(grid, i - 1, j), helper(grid, i, j - 1)));

    grid[i][j] = tmp;

    return sum + tmp;
  }
}