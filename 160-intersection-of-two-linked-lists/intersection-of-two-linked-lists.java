/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode temp=headA;
        ListNode temp2=headB;
        while(temp!=null){
            len1++;
            temp=temp.next;
        }

        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        temp=headA;
        temp2=headB;
        if(len1>len2){
            int steps=len1-len2;
            for(int i=0;i<steps;i++){
                temp=temp.next;
            }
        }

        else{
            int steps=len2-len1;
            for(int i=0;i<steps;i++){
                temp2=temp2.next;
            }
        }

        while(temp!=temp2){
            temp=temp.next;
            temp2=temp2.next;
        }
        return temp;
        
    }
}