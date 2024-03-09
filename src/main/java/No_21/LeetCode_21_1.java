package No_21;

import common.ListNode;

import java.util.LinkedList;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_21_1
 * @Date: 2024/3/9
 * @Time: 10:22
 * @Description:合并两个有序链表(双指针)
 */
public class LeetCode_21_1 {
    public static void main(String[] args) {
        Solution_1 solution_1 = new Solution_1();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode p = solution_1.mergeTwoLists(l1, l2);

        p.showValue(p);
    }
}
