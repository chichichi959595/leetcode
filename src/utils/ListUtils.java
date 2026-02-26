package utils;

public class ListUtils {
    // 陣列轉鏈結串列：傳入 {1, 2, 3}，回傳 1->2->3 的頭節點
    public static ListNode createList(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    // 列印鏈結串列：把 1->2->3 印成 [1 -> 2 -> 3 -> null]
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}