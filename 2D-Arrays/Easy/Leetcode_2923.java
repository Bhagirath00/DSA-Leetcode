class Solution {
  public int findChampion(final int[][] grid) {
    for (int team = 0; team < grid.length; ++team) {
      final int[] stats = grid[team];

      int count = 0;

      for (final int stat : stats) {
        if (stat == 0)
          count++;

        if (count > 1)
          break;
      }

      if (count == 1)
        return team;
    }

    return -1;
  }
}

// Beats 100% of Java submissions
class Solution {
  public int findChampion(int[][] grid) {
    int cand = 0;
    int n = grid.length;
    for (int i = 1; i < n; i++) {
      if (grid[cand][i] == 0) {
        cand = i;
      }
    }
    return cand;
  }
}