package No_142;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_142
 * @Date: 2024/3/10
 * @Time: 10:24
 * @Description:环形链表II
 */
public class LeetCode_142 {
    public static void main(String[] args) {
        ListNode ls = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        int pos = 1;
        ls.showValue(ls);
        ls.connectTailToPos(ls, pos);
        ListNode rs = new Solution().detectCycle(ls);

    }

}
