package No_448;

import java.util.List;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_448
 * @Date: 2024/3/8
 * @Time: 17:16
 * @Description:找出所有数组中消失的数字
 */
public class LeetCode_448 {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
//        int nums[] = {1, 1};
        Solution_1 solution = new Solution_1();
        List<Integer> ans = solution.findDisappearedNumbers(nums);

        System.out.print("[");
        int cnt = 0;
        for (int i : ans) {
            System.out.print(i);
            if (++cnt < ans.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
