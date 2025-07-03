class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    int n = nums.length;
    int i = 0;

    while (i < n) {
      int start = i;
      // Continue as long as the next number is consecutive
      while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
        i++;
      }
      // Add single number or range to the result
      if (start == i) {
        result.add(String.valueOf(nums[i]));
      } else {
        result.add(nums[start] + "->" + nums[i]);
      }
      i++;
    }
    return result;
  }
}
