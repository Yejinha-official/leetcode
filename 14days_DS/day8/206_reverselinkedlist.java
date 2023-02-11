/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Given the head of a singly linked list, reverse the list, and return the reversed list.
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode prev = null;
        ListNode current = head;

        while(current!= null){
            temp = current.next; 
            current.next = prev; 
            prev = current; 
           // if (temp ==null) return current; 
            current = temp; 
        }

        return prev; 
        
    }
}