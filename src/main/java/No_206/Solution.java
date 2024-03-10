package No_206;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/3/10
 * @Time: 14:03
 * @Description:反转链表
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }
}
