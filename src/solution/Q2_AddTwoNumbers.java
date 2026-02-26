/*2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/ 
package solution;
import utils.ListNode;
import utils.ListUtils;

public class Q2_AddTwoNumbers {
    public static void main(String[] args) {
        // 1. 快速建立測試資料
        ListNode l1 = ListUtils.createList(new int[]{2, 4, 3});
        ListNode l2 = ListUtils.createList(new int[]{5, 6, 4});

        // 2. 呼叫你的演算法
        Q2_AddTwoNumbers solver = new Q2_AddTwoNumbers();
        ListNode result = solver.addTwoNumbers(l1, l2);

        // 3. 漂亮地印出結果
        System.out.print("結果：");
        ListUtils.printList(result);
    }

    // LeetCode 的解題內容放在這
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0; //進位

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null)? l1.val : 0;
            int y = (l2 != null)? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
        //不是dummyHead是因為它通常是0
    }
}
