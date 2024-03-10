package No_142;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/3/10
 * @Time: 10:25
 * @Description:环形链表II
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode faster = head;
        ListNode slower = head;
        Boolean flag = false;

        while (faster.next != null && faster.next.next != null) {
            faster = faster.next.next;
            slower = slower.next;

            if (faster == slower) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            slower = head;

            while (slower != faster) {
                faster = faster.next;
                slower = slower.next;
            }

            return slower;
        }

        return null;
    }
}
