package leetCode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
            if (node.val == nextNode.val) {
                nextNode = nextNode.next;
                node.next = nextNode;
            }else {
                node = nextNode;
                nextNode = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(2)));
        deleteDuplicates(ln1);
        ListNode ln2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        deleteDuplicates(ln2);

    }
}
