package No_21_合并两个有序链表;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_21_2
 * @Date: 2024/3/9
 * @Time: 9:35
 * @Description:合并两个有序链表(递归)
 */
public class LeetCode_21_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode p = new Solution_2().mergeTwoLists(l1, l2);

        p.showValue(p);
    }
}
