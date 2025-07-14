// Brute Force

class Solution {
  public int[] rowAndMaximumOnes(int[][] mat) {
    int index = -1;
    int countMax = -1;

    int currIndex = 0;
    for (int[] row : mat) {
      int countRow = 0;
      for (int i = 0; i < row.length; i++) {
        countRow += row[i];
      }

      if (countRow > countMax) {
        countMax = countRow;
        index = currIndex;
      }
      currIndex++;
    }

    return new int[] { index, countMax };
  }
}
