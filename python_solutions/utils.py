class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def create_list(arr):
    if not arr: return None
    head = ListNode(arr[0])
    curr = head
    for i in range(1, len(arr)):
        curr.next = ListNode(arr[i])
        curr = curr.next
    return head

def print_list(head):
    curr = head
    nodes = []
    while curr:
        nodes.append(str(curr.val))
        curr = curr.next
    print(" -> ".join(nodes) + " -> None")