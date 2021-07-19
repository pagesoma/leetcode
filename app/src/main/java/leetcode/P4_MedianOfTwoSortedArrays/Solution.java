package leetcode.P4_MedianOfTwoSortedArrays;

import java.util.Arrays;

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (!isValidate(nums1, nums2)) {
      return 0d;
    }
    if (nums1.length == 1 && nums2.length == 0) {
      return nums1[0];
    }
    if (nums1.length == 0 && nums2.length == 1) {
      return nums2[0];
    }

    int[] mergedArray = mergeArray(nums1, nums2);
    if (mergedArray.length % 2 == 0) {
      return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
    } else {
      return mergedArray[mergedArray.length / 2];
    }
  }

  private int[] mergeArray(int[] nums1, int[] nums2) {
    int[] mergedArray = new int[nums1.length + nums2.length];
    int i = 0;
    for (int num : nums1) {
      mergedArray[i++] = num;
    }
    for (int num : nums2) {
      mergedArray[i++] = num;
    }
    Arrays.sort(mergedArray);

    return mergedArray;
  }

  private boolean isValidate(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2 == null) {
      return false;
    }

    return true;
  }
}
