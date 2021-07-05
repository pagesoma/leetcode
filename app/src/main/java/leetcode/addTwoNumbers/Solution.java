package leetcode.addTwoNumbers;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    // input 1
    // [9]
    // [1,9,9,9,9,9,9,9,9,9]
    // l1 = new ListNode(9);
    // l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new
    // ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

    // input 2
    // [0,8,8,8,8,2,9,3,1,1]
    // [0,9,1,5,5,5,1,1,6]
    // l1 = new ListNode(0, new ListNode(8, new ListNode(8, new ListNode(8, new ListNode(8, new
    // ListNode(2, new ListNode(9, new ListNode(3, new ListNode(1, new ListNode(1))))))))));
    // l2 = new ListNode(0, new ListNode(9, new ListNode(1, new ListNode(5, new ListNode(5, new
    // ListNode(5, new ListNode(1, new ListNode(1, new ListNode(6)))))))));

    // input 3
    // [9,9,9,9,9,9,9]
    // [9,9,9,9]
    // l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new
    // ListNode(9, new ListNode(9)))))));
    // l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

    if (hasOnlyZero(l1) && hasOnlyZero(l2)) {
      return new ListNode(0);
    }

    ListNode result = null;
    ListNode current = null;

    int increase = 0;

    int l1Val = 0;
    int l2Val = 0;
    int l3Val = 0;

    do {
      l1Val = (l1 != null) ? l1.val : 0;
      l2Val = (l2 != null) ? l2.val : 0;

      l3Val = (l1Val + l2Val + increase);
      increase = (l3Val >= 10) ? 1 : 0;
      l3Val %= 10;

      if (current == null) {
        result = new ListNode(l3Val);
        current = result;
      } else {
        current.next = new ListNode(l3Val);
        current = current.next;
      }

      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;

    } while (l1 != null || l2 != null);

    if (increase == 1) {
      current.next = new ListNode(1);
      current = current.next;
    }
    current.next = null;

    return result;
  }

  private boolean hasOnlyZero(ListNode node) {
    return node == null || (node.val == 0 && node.next == null);
  }

  // Definition for singly-linked list.
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
