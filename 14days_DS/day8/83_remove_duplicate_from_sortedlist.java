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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // pass obvious case
        if(head == null) return head; 

        ListNode current = head; 

        //Since it is sorted, it only needs to compare with the next node
        while(current!=null && current.next !=null){
           if(current.val == current.next.val){
               current.next = current.next.next; 
           }else{
                current =current.next;  
           }
        }

        return head; 

    }
}