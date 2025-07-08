/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // or fast also we can return
            }
        }
        return null;

        // Set<ListNode> set = new HashSet<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(set.contains(temp)) return temp;
        //     set.add(temp);
        //     temp = temp.next;
        // }
        // return null;
    }
}