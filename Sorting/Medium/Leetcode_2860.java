class Solution {
  public int countWays(List<Integer> nums) {
    int ans = 0;
    int[] l = new int[nums.size() + 1];
    for (int i = 0; i < nums.size(); i++) {
      l[nums.get(i)]++;
    }

    int people = 0;
    for (int i = 0; i < nums.size() + 1; i++) {
      if (l[i] != 0) {
        people += l[i];
        continue;
      }
      if (people == i) {
        ans++;
      }
    }
    return ans;
  }
}