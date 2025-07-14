import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode({1, 0, 1});
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(head));
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        cur = head;
        int res = 0;

        int i = len-1;
        while(cur != null){
            res += (int) Math.pow(2, i) * cur.val;
            cur =cur.next;
            i--;
        }
        return res;
    }
}
