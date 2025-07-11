class Solution {
  public String arrangeWords(String text) {

    text = text.substring(0, 1).toLowerCase().concat(text.substring(1));
    StringBuilder sb = new StringBuilder();
    String[] arr = text.split(" ");
    Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));
    for (String str : arr) {
      sb.append(str).append(" ");
    }
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
    return sb.toString().trim();
  }
}