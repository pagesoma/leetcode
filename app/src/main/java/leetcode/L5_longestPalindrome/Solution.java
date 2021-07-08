package leetcode.L5_longestPalindrome;

public class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.isEmpty()) return "";
    if (s.length() == 1) return s;
    if (s.length() == 2) return (s.charAt(0) == s.charAt(1)) ? s : Character.toString(s.charAt(0));

    int maxLength = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
      int length = Math.max(getLength(i, i, s), getLength(i, i + 1, s));

      if (maxLength < length) {
        maxLength = length;
        start = i - (length - 1) / 2;
      }
    }

    return s.substring(start, start + maxLength);
  }

  private int getLength(int left, int right, String s) {
    if (right > s.length()) return 0;

    int length = (left == right) ? -1 : 0;

    while (left >= 0 && right < s.length()) {
      if (s.charAt(left) != s.charAt(right)) break;

      length += 2;
      left--;
      right++;
    }

    return length;
  }
}
