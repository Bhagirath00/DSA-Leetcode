class Solution {
  public int lengthOfLastWord(String s) {
    int idx = s.length() - 1;
    while (idx >= 0 && s.charAt(idx) == ' ')
      idx--;

    int count = 0;
    while (idx >= 0 && s.charAt(idx) != ' ') {
      count++;
      idx--;
    }
    return count;
  }
}
