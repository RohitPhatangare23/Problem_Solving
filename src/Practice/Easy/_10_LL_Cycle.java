package Practice.Easy;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class _10_LL_Cycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        _10_LL_Cycle solution = new _10_LL_Cycle();

        // Test case 1: List with no cycle
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        System.out.println("Test case 1 (no cycle): " + solution.hasCycle(head1)); // Expected output: false

        // Test case 2: List with a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // Creates a cycle

        System.out.println("Test case 2 (with cycle): " + solution.hasCycle(head2)); // Expected output: true
    }
}

