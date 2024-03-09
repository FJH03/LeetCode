package No_21;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: ListNode
 * @Date: 2024/3/9
 * @Time: 9:33
 * @Description:单链表的定义
 */
public class ListNode {
    Integer val = null;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
