package week2p;

import java.util.List;

public class Day12 {
    static void main(String[] args) {

    }

    /*Reverse a Linked List
Reverse a singly linked list and return the new head.

Example. 1 -> 2 -> 3 -> null becomes 3 -> 2 -> 1 -> null*/

   /*"To reverse a singly linked list efficiently, I use an iterative, three-pointer approach.
   I initialize a prev pointer to null and a curr pointer to the head.
   As I traverse the list in a single pass, I temporarily store curr.next so I don't lose the rest of the list.
    Then, I flip the current node's pointer to face backward by setting curr.next = prev.
     Finally, I shift both prev and curr forward one step.This runs in \(\mathcal{O}(n)\) time because we visit each node exactly once,
      and \(\mathcal{O}(1)\) auxiliary space since we are updating the links in place without allocating any new memory.
      It also naturally handles edge cases like an empty list or a list with a single node."*/




    /*Merge Two Sorted Lists
Merge two sorted linked lists into one sorted list.

Example. 1 -> 3 -> 5 and 2 -> 4 -> 1 -> 2 -> 3 -> 4 -> 5*/
    public static class ListNode {
        int val;
        ListNode next;
        ListNode head;
        ListNode(int val) { this.val = val; }
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l2 : l1;
        return dummy.next;
    }

    /*Linked List CycleEasy
Detect whether a linked list loops back on itself.

Example. 1 -> 2 -> 3 -> back to node 2 -> true*/

    public boolean cycleLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }

        return false;
    }

    /* The simplest approach is to keep a history of everywhere you've been, but that hogs a lot of memory as data grows.Instead, I use a two-pointer approach, often called the 'Tortoise and the Hare' strategy. You set two runners at the start line: one moves at normal speed, and the other moves twice as fast. If the path is a straight line, the fast runner hits the end and you're done. But if there’s a loop, the fast runner will eventually lap the slow runner and they will collide.*/
}
