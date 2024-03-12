package No_88_合并两个有序数组;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/3/8
 * @Time: 16:07
 * @Description:合并两个有序数组
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { //结果合并至nums1里
        int i = 0, j = 0, k = 0;
        int ans[] = new int[nums1.length];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < m) {
            ans[k++] = nums1[i++];
        }

        while (j < n) {
            ans[k++] = nums2[j++];
        }

        for (int l = 0; l < m + n; l++) {
            nums1[l] = ans[l];
        }
    }
}
