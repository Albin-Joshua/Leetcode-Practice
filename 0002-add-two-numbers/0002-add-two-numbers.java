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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result1 = new ListNode(-1);
        ListNode result = result1;
        int rem=0;
        while(l1!=null && l2!=null){
            int sum=l1.val + l2.val + rem;
            rem=sum/10;
            sum = sum%10;
            ListNode dummy = new ListNode(sum);
            result.next = dummy;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = l1.val + rem;
            rem=sum/10;
            sum = sum%10;
            ListNode dummy = new ListNode(sum);
            result.next = dummy;
            result = result.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = l2.val + rem;
            rem=sum/10;
            sum = sum%10;
            ListNode dummy = new ListNode(sum);
            result.next = dummy;
            result = result.next;
            l2 = l2.next;
        }
        if(rem>0){
            ListNode dummy = new ListNode(rem);
            result.next = dummy;
        }
        return result1.next;
    }
}