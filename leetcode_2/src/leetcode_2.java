import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName leetcode_2
 * @ClassName leetcode_2
 * @Description TODO
 * @Author Lyn
 * @Date 2021/1/17 23:59
 * @Version 1.0
 * @Function
 */

public class leetcode_2 {

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    /**
     * 两数相加
     *
     * @param l1
     * @param l2
     * @return {@link ListNode}
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode res = new ListNode(0);
        ListNode l3 = res;
        while (l1 != null || l2 != null || temp != 0) {
            int val1 = l1 != null ? l1.val: 0;
            int val2 = l2 != null ? l2.val: 0;
            int sum = val1 + val2 + temp;
            temp = sum / 10;
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return res.next;
    }
}