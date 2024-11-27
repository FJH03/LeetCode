package 栈与队列专题.No_921_使括号有效的最少添加;

import java.util.Stack;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/11/27
 * @Time: 16:15
 * @Description:使括号有效的最少添加(使用栈)
 */
class Solution_1 {
    public int minAddToMakeValid(String s) {
        Stack<Character> S = new Stack<>();
        for (char i : s.toCharArray()) {
            if (!S.isEmpty() && S.peek() == '(' && i == ')') {
                S.pop();
            } else {
                S.add(i);
            }
        }
        return S.size();
    }
}
