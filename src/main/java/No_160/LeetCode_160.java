package No_160;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_160
 * @Date: 2024/3/10
 * @Time: 10:44
 * @Description:相交链表
 */
public class LeetCode_160 {
    public static void main(String[] args) {
        ListNode ls = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode ls_a = new ListNode(4, new ListNode(1, ls));
        ListNode ls_b = new ListNode(5, new ListNode(6, new ListNode(1, ls)));
//        ListNode ls = new ListNode(2, new ListNode(4));
//        ListNode ls_a = new ListNode(1, new ListNode(9, new ListNode(1, ls)));
//        ListNode ls_b = new ListNode(3, ls);

        ListNode rs = new Solution().getIntersectionNode(ls_a, ls_b);
        System.out.println("Intersected at " + rs.val);
    }
}
