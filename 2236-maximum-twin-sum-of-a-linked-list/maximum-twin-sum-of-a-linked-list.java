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
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public int pairSum(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;
         while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         slow.next=reverse(slow.next);
         int maxSum=0;
         ListNode head1=head;
         ListNode head2=slow.next;
         while(head2!=null){
            int sum=head1.val+head2.val;
            if(maxSum<sum){
                maxSum=sum;
            }
            head1=head1.next;
            head2=head2.next;
         }

        return maxSum;
    }
}