package leetcode.P6_ZigZagConversion;

import java.util.Arrays;

class Solution {
  public String convert(String s, int numRows) {
    if (!isValidate(s, numRows)) {
      return s == null ? "" : s;
    }

    if (numRows == 1) {
      return s;
    }

    // input = PAYPALISHIRING, 3

    // P   A   H   N
    // A P L S I I G
    // Y   I   R

    // output = PAHNAPLSIIGYIR

    // initialize array
    String[] strArr = new String[numRows];
    Arrays.fill(strArr, "");

    int row = 0;
    boolean updown = true; // up:true, down:false

    int strLength = s.length();
    for (int i = 0; i < strLength; i++) {
      strArr[row] += s.charAt(i);

      if (row == numRows - 1 && updown) {
        updown = false;
      } else if (row == 0 && !updown) {
        updown = true;
      }

      if (updown) {
        row++;
      } else {
        row--;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (String str : strArr) {
      sb.append(str);
    }

    return sb.toString();
  }

  private boolean isValidate(String s, int numRows) {
    if (s == null || s.isEmpty()) {
      return false;
    }

    int strLength = s.length();
    if (strLength <= 1 || strLength > 1000) {
      return false;
    }
    if (numRows < 1 || numRows > 1000) {
      return false;
    }

    return true;
  }
}
