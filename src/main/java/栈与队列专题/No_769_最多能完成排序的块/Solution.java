package 栈与队列专题.No_769_最多能完成排序的块;

import java.util.Stack;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/11/27
 * @Time: 17:23
 * @Description:添加自定义描述
 */
class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> S = new Stack<>();
        for (int i : arr) {
            if (!S.isEmpty() && S.peek() > i) {
                int top = S.pop();
                while (!S.isEmpty()) {
                    if (S.peek() < i) {
                        break;
                    }
                    S.pop();
                }
                S.push(top);
            } else {
                S.push(i);
            }
        }
        return S.size();
    }
}
