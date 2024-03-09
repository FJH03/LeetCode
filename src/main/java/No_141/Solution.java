package No_141;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/3/9
 * @Time: 18:25
 * @Description:环形链表
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;//慢指针
        ListNode faster = head;//快指针

        while (faster.next != null && faster.next.next != null) {
            slow = slow.next;
            faster = faster.next.next;
            if (faster == slow) {
                return true;
            }
        }

        return false;
    }
}
