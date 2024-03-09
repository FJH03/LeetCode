package No_21;

import common.ListNode;

import java.util.LinkedList;

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
        Solution_2 solution_2 = new Solution_2();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode p = solution_2.mergeTwoLists(l1, l2);

        p.showValue(p);
    }
}
