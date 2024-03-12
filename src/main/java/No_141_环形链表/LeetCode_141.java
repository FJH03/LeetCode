package No_141_环形链表;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_141
 * @Date: 2024/3/9
 * @Time: 18:27
 * @Description:环形链表
 */
public class LeetCode_141 {
    public static void main(String[] args) {
        ListNode ls = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        int pos = 1;
//        ListNode ls = new ListNode(1, new ListNode(2));
//        int pos = 0;
//        ls.showValue(ls);
        ls.connectTailToPos(ls, pos);

        System.out.println("[" + new Solution().hasCycle(ls) + "]");
    }
}
