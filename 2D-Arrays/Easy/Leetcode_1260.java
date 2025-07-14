class Solution {
  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int n = grid.length;
    int m = grid[0].length;
    int[][] ans = new int[n][m];
    int size = n * m;
    k %= size;
    k = size - k;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ans[i][j] = grid[(i + (j + k) / m) % n][(j + k) % m];
      }
    }
    return (List) Arrays.asList(ans);
  }
}