package leetcode.P7_ReverseInteger;

class Solution {
  public int reverse(int x) {
    if (!isValidate(x)) {
      return 0;
    }
    if (x == 0) {
      return 0;
    }

    boolean isMinus = x < 0;
    if (isMinus) {
      x *= -1;
    }

    StringBuilder sb = new StringBuilder();
    sb.append(x);
    sb.reverse();

    int result = 0;
    try {
      result = Integer.parseInt(sb.toString());
    } catch (NumberFormatException ignore) {
    }

    return (isMinus) ? -1 * result : result;
  }

  private boolean isValidate(int x) {
    if (x < Math.pow(-2, 31)) {
      return false;
    }
    if (x > Math.pow(2, 31) - 1) {
      return false;
    }

    return true;
  }
}
