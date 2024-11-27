package 栈与队列专题.No_921_使括号有效的最少添加;

import java.util.Scanner;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_921
 * @Date: 2024/11/27
 * @Time: 16:13
 * @Description:使括号有效的最少添加
 */
public class LeetCode_921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Solution_1().minAddToMakeValid(str));
        System.out.println(new Solution_2().minAddToMakeValid(str));
    }
}
