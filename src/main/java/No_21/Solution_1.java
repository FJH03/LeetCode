package No_21;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution_1
 * @Date: 2024/3/9
 * @Time: 10:18
 * @Description:合并两个有序链表(双指针)
 */
public class Solution_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode p = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }

            p = p.next;
        }

        if (list1 != null) {
            p.next = list1;
        }

        if (list2 != null) {
            p.next = list2;
        }

        return result.next;
    }
}
