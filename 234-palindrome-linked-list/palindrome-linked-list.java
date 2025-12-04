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
    private static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode front=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode temp1=head;
        ListNode temp2=slow.next;
        while(temp2!=null){
            if(temp1.val!=temp2.val) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
        
}
