package No_1_两数之和;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_1
 * @Date: 2024/3/8
 * @Time: 15:41
 * @Description:两数之和
 */
public class LeetCode_1 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = new Solution().twoSum(nums, target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
