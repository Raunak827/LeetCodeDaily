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
        int carry=0;
        ListNode sum=new ListNode(0);
        ListNode tail=sum;
        while(l1 != null || l2!=null || carry!=0){
            int val1=(l1 != null) ? l1.val : 0;;
            int val2=(l2 != null) ? l2.val : 0;
            int s = val1 + val2 + carry;
            int digit = s % 10;
            carry = s / 10;
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = sum.next;
        sum.next = null;
        return result;
    }
}