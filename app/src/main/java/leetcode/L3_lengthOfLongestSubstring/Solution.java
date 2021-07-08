package leetcode.L3_lengthOfLongestSubstring;

import java.util.HashSet;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    if (s.length() == 1) {
      return 1;
    }

    HashSet<Character> hashSet = new HashSet();
    int left = 0;
    int right = 0;
    int max = 0;
    int loopCount = s.length();

    while (right < loopCount) {
      if (!hashSet.contains(s.charAt(right))) {
        hashSet.add(s.charAt(right));
        right++;
        max = Math.max(hashSet.size(), max);
      } else {
        hashSet.remove(s.charAt(left));
        left++;
      }
    }

    return max;
  }
}
