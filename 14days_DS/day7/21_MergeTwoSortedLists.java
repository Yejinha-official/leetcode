package day7;
// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //list2.head 와 list1.head.next 부터 비교 출발 
        ListNode result =new ListNode(-1); 

        if(list1 == null) return list2;
        if(list2 ==null) return list1; 

        ListNode prev = result; 
        
        while(list2 != null && list1 != null){
            if(list1.val <= list2.val){
                prev.next = list1; 
                list1= list1.next; 
            }else{
                prev.next = list2; 
                list2= list2.next; 
            }
            prev = prev.next;
        }

         prev.next = list1 == null ? list2 : list1;

        return result.next; 

        
    }
}