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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        int count=0;
        ListNode oddhead=new ListNode(0);
        ListNode evenhead=new ListNode(0);
        ListNode odd=oddhead;
        ListNode even=evenhead;
        while(temp!=null){
            count++;
            if(count%2==0){
                even.next=new ListNode(temp.val);
               even=even.next;
            }
            else{
                odd.next=new ListNode(temp.val);
                odd=odd.next;
            }
            temp=temp.next;
        }
        odd.next=evenhead.next;
        return oddhead.next;
    }
}