package No_141_环形链表;

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

        ListNode slower = head;//慢指针
        ListNode faster = head;//快指针

        while (faster.next != null && faster.next.next != null) {
            slower = slower.next;
            faster = faster.next.next;
            if (faster == slower) {
                return true;
            }
        }

        return false;
    }
}
