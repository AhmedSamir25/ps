public class Main {

    public static void main(String[] args) {}
}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (
            fast != null &&
            fast.next != null &&
            slow.next != null &&
            slow.next.next != null
        ) {
            fast = fast.next;
            slow = slow.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
