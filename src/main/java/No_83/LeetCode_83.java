package No_83;

import common.ListNode;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_83
 * @Date: 2024/3/9
 * @Time: 11:11
 * @Description:删除排序链表中的重复元素
 */
public class LeetCode_83 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3))))));

//        ListNode listNode = new ListNode();
        ListNode result = solution.deleteDuplicates(listNode);


        result.showValue(result);
    }
}
