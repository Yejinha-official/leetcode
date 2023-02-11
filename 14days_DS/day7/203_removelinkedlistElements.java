package day7;

// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

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

public class 203_removelinkedlistElements {
    public ListNode removeElements(ListNode head, int val) {

        // step 1: we have to make ListNodes to point current node, return value; 
        ListNode returnValue = new ListNode(-1);
        returnValue.next = head;  // point head 
    
        ListNode prev = returnValue; // set index -1 , because we have to compare the first node (index 0)
        ListNode current = head; 
    
        while(current!=null){
          if(current.val == val){
            prev.next = current.next; 
          }else{ 
            prev = current; 
          }
          current = current.next; 
        }
    
        return returnValue.next;
        
        }
}