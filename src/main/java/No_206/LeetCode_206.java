package No_206;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_206
 * @Date: 2024/3/10
 * @Time: 14:02
 * @Description:反转链表
 */
public class LeetCode_206 {
    public static void main(String[] args) {
        ListNode ls = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode rs = new Solution().reverseList(ls);
        rs.showValue(rs);
    }
}
