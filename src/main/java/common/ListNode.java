package common;

import java.util.LinkedList;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: ListNode
 * @Date: 2024/3/9
 * @Time: 9:33
 * @Description:单链表的定义
 */
public class ListNode {
    public Integer val = null;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void showValue(ListNode listNode) {
        ListNode t = listNode;

        LinkedList<Integer> l = new LinkedList<>();
        int cnt = 0;
        System.out.print("[");
        while (t != null) {
            l.add(t.val);
            t = t.next;
        }

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (++cnt < l.size()) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }
}
