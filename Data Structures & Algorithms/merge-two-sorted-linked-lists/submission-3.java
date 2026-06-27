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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode head = null;
        ListNode prev = null;
        while(t1 != null && t2 != null)
        {
            ListNode temp = new ListNode();
            if(head == null){ 
                head = temp;
            }
            if(t1.val < t2.val){
                temp.val = t1.val;
                t1 = t1.next;
            }else{
                temp.val = t2.val;
                t2 = t2.next;
            }
            if(prev != null){
                prev.next = temp;
            }
            prev = temp;
        }
        while(t1 != null){
           ListNode temp = new ListNode();
            if(head == null){ 
                head = temp;
            }
                temp.val = t1.val;
                t1 = t1.next;
            if(prev != null){
                prev.next = temp;
            }
            prev = temp;
        }
        while(t2 != null){
            ListNode temp = new ListNode();
            if(head == null){ 
                head = temp;
            }
                temp.val = t2.val;
                t2 = t2.next;
            if(prev != null){
                prev.next = temp;
            }
            prev = temp;
        }
        return head;
    }
}