class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> arr = new HashSet<>();
    for (int n : nums) {
      if (!arr.add(n)) {
        return true;
      }
    }
    return false;
  }
}