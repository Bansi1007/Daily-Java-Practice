package week2p;

public class Day13 {
    public static void main(String[] args) {

    }

    /*Middle of the Linked List
Return the middle node. With an even count, return the second of the two middles.

Example. 1 -> 2 -> 3 -> 4 -> 5 -> node 3*/

    public Day12.ListNode middleOfTheLinkedList(Day12.ListNode head) {

        Day12.ListNode slow=head, fast = head;
        while (fast != null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /*Remove Nth Node From End
Remove the nth node counting from the end and return the head.

Example. 1 -> 2 -> 3 -> 4 -> 5, n = 2 -> 1 -> 2 -> 3 -> 5*/

    public Day12.ListNode removeNthFromEnd(Day12.ListNode head, int n) {
        Day12.ListNode dummy = new Day12.ListNode(0);
        dummy.next = head;
        Day12.ListNode lead = dummy, trail = dummy;

        for (int i = 0; i <= n; i++) lead = lead.next;
        while (lead != null) {
            lead = lead.next;
            trail = trail.next;
        }
        trail.next = trail.next.next;
        return dummy.next;
    }

    /*"To remove the Nth node from the end of a linked list in a single pass, I use a two-pointer approach with a fast and a slow pointer.First, I introduce a dummy node that points to the head of the list. This is a critical defensive design choice because it gracefully handles edge cases, such as when we need to delete the very first node of the list.Next, I advance the fast pointer N + 1 steps ahead. This establishes a fixed gap of exactly N nodes between the two pointers.Then, I move both pointers forward together at the same speed. When the fast pointer hits the end of the list (becoming null), the slow pointer will be pointing exactly one node before the target.Finally, I skip the target node by setting slow.next = slow.next.next and return dummy.next.This achieves an optimal O(L) time complexity because we only traverse the list once, and O(1) auxiliary space since we only use two tracking pointers."*/
}
