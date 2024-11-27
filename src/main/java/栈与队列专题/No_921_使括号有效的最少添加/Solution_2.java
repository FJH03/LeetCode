package 栈与队列专题.No_921_使括号有效的最少添加;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution_2
 * @Date: 2024/11/27
 * @Time: 17:06
 * @Description:使括号有效的最小添加(找规律)
 */
public class Solution_2 {
    public int minAddToMakeValid(String s) {
        int leftCount = 0;// 需要添加）的（个数
        int rightCount = 0;// 需要添加（的）个数
        for (char i : s.toCharArray()) {
            if (i == '(') {
                leftCount++;
            } else {
                if (leftCount == 0) {
                    rightCount++;
                } else {
                    leftCount--;
                }
            }
        }

        return leftCount + rightCount;
    }
}

