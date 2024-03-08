package No_88;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: LeetCode_88
 * @Date: 2024/3/8
 * @Time: 16:07
 * @Description:合并两个有序数组
 */
public class LeetCode_88 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0}, m = 3;
        int nums2[] = {2, 5, 6}, n = 3;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        System.out.print("[");
        int cnt = 0;
        for (int i : nums1) {
            System.out.print(i);
            if (++cnt < nums1.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
