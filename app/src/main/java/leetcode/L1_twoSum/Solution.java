package leetcode.L1_twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    int num = 0;
    int loopCount = nums.length;

    for (int i = 0; i < loopCount; i++) {
      num = target - nums[i];
      if (map.get(num) != null) {
        return new int[] {map.get(num), i};
      }

      map.put(nums[i], i);
    }

    return null;
  }
}
