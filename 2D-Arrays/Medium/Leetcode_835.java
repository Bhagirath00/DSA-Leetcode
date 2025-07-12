class Solution {
  public int largestOverlap(int[][] img1, int[][] img2) {
    int N = img1.length;
    int[][] account = new int[2 * N][2 * N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (img1[i][j] == 1) {
          for (int m = 0; m < N; m++) {
            for (int n = 0; n < N; n++) {
              if (img2[m][n] == 1) {
                account[i - m + N][j - n + N]++;
              }
            }
          }
        }
      }
    }
    int max = 0;
    for (int i = 0; i < 2 * N; i++) {
      for (int j = 0; j < 2 * N; j++) {
        max = Math.max(max, account[i][j]);
      }
    }
    return max;
  }
}