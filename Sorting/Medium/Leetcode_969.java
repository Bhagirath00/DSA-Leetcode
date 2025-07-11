class Solution {
  public void flip(int[] arr, int k) {
    int i = 0, j = k;
    while (i < j) {
      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      i++;
      j--;
    }
  }

  public int find_largest(int[] arr, int n) {
    int idx = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[idx])
        idx = i;
    }
    return idx;
  }

  public List<Integer> pancakeSort(int[] arr) {
    List<Integer> res = new LinkedList<>();
    int n = arr.length;

    for (int i = n; i > 1; i--) {
      int idx = find_largest(arr, i);
      flip(arr, idx);
      res.add(idx + 1);
      flip(arr, i - 1);
      res.add(i);
    }
    return res;
  }
}