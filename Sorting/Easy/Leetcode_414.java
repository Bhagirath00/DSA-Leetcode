class Solution {
  public int thirdMax(int[] nums) {
    Long first = Long.MIN_VALUE;
    Long second = Long.MIN_VALUE;
    Long third = Long.MIN_VALUE;

    for (int num : nums) {
      long n = num;
      if (n == first || n == second || n == third)
        continue;

      if (n > first) {
        third = second;
        second = first;
        first = n;
      } else if (n > second) {
        third = second;
        second = n;
      } else if (n > third) {
        third = n;
      }
    }
    return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
  }
}
