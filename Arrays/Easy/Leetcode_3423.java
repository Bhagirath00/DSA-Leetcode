class Solution {
  public int maxAdjacentDistance(int[] nums) {
    int maxDiff = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++)
      maxDiff = Math.max(maxDiff, Math.abs(nums[i]
          - nums[(i + 1) % nums.length]));
    return maxDiff;
  }
}