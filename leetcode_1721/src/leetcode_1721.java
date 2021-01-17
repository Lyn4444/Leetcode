import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName leetcode_1721
 * @ClassName leetcode_1721
 * @Description TODO
 * @Author Lyn
 * @Date 2021/1/17 22:46
 * @Version 1.0
 * @Function
 */

public class leetcode_1721 {

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
     * 交换节点的值
     *
     * @param head
     * @param k
     * @return {@link ListNode}
     */
    public ListNode swapNodes(ListNode head, int k) {
        ListNode listNode1 = head;
        ListNode listNode2 = head;
        for (int i = 0; i < k - 1 ; i ++ ) {
            listNode1 = listNode1.next;
        }
        int temp = listNode1.val;
        ListNode listNode3 = listNode1;
        while (listNode1.next != null) {
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        listNode3.val = listNode2.val;
        listNode2.val = temp;
        return head;
    }
}