from utils import ListNode, create_list, print_list

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy_head = ListNode(0)
        current = dummy_head
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            total = val1 + val2 + carry

            carry = total // 10
            current.next = ListNode(total % 10)
            current = current.next

            if l1: l1 = l1.next
            if l2: l2 = l2.next

        return dummy_head.next
    
if __name__ == "__main__":
    l1 = create_list([2, 4, 3])
    l2 = create_list([5, 6, 4])

    sol = Solution()
    result = sol.addTwoNumbers(l1, l2)
    print_list(result)