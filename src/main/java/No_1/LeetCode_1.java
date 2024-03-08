package No_1;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_1
 * @Date: 2024/3/8
 * @Time: 15:41
 * @Description:添加自定义描述
 */
public class LeetCode_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = solution.twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
