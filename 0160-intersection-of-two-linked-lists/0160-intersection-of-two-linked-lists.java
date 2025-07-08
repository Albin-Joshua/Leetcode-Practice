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
        ListNode n1 = headA;
        ListNode n2 = headB;
        int count1 = 0;
        int count2 = 0;
        while(n1 != null){
            count1++;
            n1 = n1.next;
        }
        while(n2 != null){
            count2++;
            n2 = n2.next;
        }
        ListNode a1 = headA;
        ListNode a2 = headB;
        while(count1>count2){
            a1 = a1.next;
            count1--;
        }
        while(count2>count1){
            a2 = a2.next;
            count2--;
        }
        while(a1 != null || a2 != null){
            if(a1 == a2){
                return a1;
            }
            else{
                a1 = a1.next;
                a2 = a2.next;
            }
        }
        return null;

        // Set<ListNode> set = new HashSet<>();
        // ListNode n1 = headA;
        // while(n1 != null){
        //     set.add(n1);
        //     n1 = n1.next;
        // }
        // ListNode n2 = headB;
        // while(n2 != null){
        //     if(set.contains(n2)){
        //         return n2;
        //     }
        //     n2 = n2.next;
        // }
        // return null;
    }
}