package No_283_移动零;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_283
 * @Date: 2024/3/8
 * @Time: 16:59
 * @Description:移动零
 */
public class LeetCode_283 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);

        System.out.print("[");
        int cnt = 0;
        for (int i : nums) {
            System.out.print(i);
            if (++cnt < nums.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
