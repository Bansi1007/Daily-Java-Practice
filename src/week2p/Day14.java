package week2p;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Day14 {
    static void main(String[] args) {

    }

    //Palindrome Linked List
    //Decide whether a linked list reads the same forwards and backwards, using constant extra space.
    //Example. 1 -> 2 -> 2 -> 1 -> true

    /*Find the middle with slow and fast pointers, reverse the second half in place,
    then walk both halves comparing. It combines two techniques you already know, which is exactly why it gets asked.

Complexity. Time O(n), space O(1)

public boolean isPalindrome(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode second = reverse(slow);
    ListNode first = head;
    while (second != null) {
        if (first.val != second.val) return false;
        first = first.next;
        second = second.next;
    }
    return true;
}

private ListNode reverse(ListNode node) {
    ListNode prev = null;
    while (node != null) {
        ListNode next = node.next;
        node.next = prev;
        prev = node;
        node = next;
    }
    return prev;
}*/


   /* Invert Binary TreeEasy
    Mirror a binary tree: every left child becomes the right child.

            Example. [4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]*/
// Source - https://stackoverflow.com/a/3522481
// Posted by jjnguy, modified by community. See post 'Timeline' for change history
// Retrieved 2026-09-05, License - CC BY-SA 3.0
   public class TreeNode<T> {
       public T data;             // The value stored in the node
       public TreeNode<T> left;   // Reference to the left child
       public TreeNode<T> right;  // Reference to the right child

       // Constructor to initialize the node with data
       public TreeNode(T data) {
           this.data = data;
           this.left = null;      // Children are null until explicitly added
           this.right = null;
       }
   }

    public TreeNode invertTree(TreeNode root){
        if (root==null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;

    }

    /*Maximum Depth of Binary Tree
Return the number of nodes on the longest path from the root down to a leaf.

Example. [3,9,20,null,null,15,7] -> 3*/

    public int maxDepth(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
