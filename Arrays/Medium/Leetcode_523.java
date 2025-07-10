class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> mp = new HashMap<>();

    int prefixsum = 0;
    for (int i = 0; i < nums.length; i++) {
      prefixsum += nums[i];
      int rem = prefixsum % k;
      if (rem == 0 && i >= 1)
        return true;

      if (mp.containsKey(rem)) {
        int idx = mp.get(rem);
        if ((i - idx) >= 2)
          return true;
      } else
        mp.put(rem, i);
    }
    return false;
  }
}