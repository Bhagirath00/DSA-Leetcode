class Solution {
  public void findSecretWord(String[] wordlist, Master master) {
    for (int t = 0; t < 10; t++) {
      String guess = wordlist[(int) (Math.random() * wordlist.length)];
      int match = master.guess(guess);
      if (match == 6)
        return;

      List<String> newList = new ArrayList<>();
      for (String word : wordlist) {
        if (getMatchCount(word, guess) == match) {
          newList.add(word);
        }
      }
      wordlist = newList.toArray(new String[0]);
    }
  }

  private int getMatchCount(String a, String b) {
    int count = 0;
    for (int i = 0; i < 6; i++) {
      if (a.charAt(i) == b.charAt(i))
        count++;
    }
    return count;
  }
}