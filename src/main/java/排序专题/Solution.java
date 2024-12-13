package 排序专题;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/12/12
 * @Time: 11:21
 * @Description:添加自定义描述
 */
public class Solution {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, -5, 4, 0};

        bubbleSort(nums);

        System.out.println("这个排序采用了冒泡排序:");
        for (int item : nums) {
            System.out.print(item + " ");
        }

        System.out.println();

        int nums1[] = {3, 6, 78, 7};

        quick_sort(nums1, 0, nums1.length - 1);

        System.out.println("这个排序采用了快速排序:");

        for (int item : nums1) {
            System.out.print(item + " ");
        }

        System.out.println();

        int nums2[] = {5, 4, 78, 14, 12};

        merge_sort(nums2, 0, nums2.length - 1);

        System.out.println("这个排序采用了归并排序:");

        for (int item : nums2) {
            System.out.print(item + " ");
        }

    }

    /**
     * 归并排序
     * @param nums 原数组
     * @param l 原数组左边界
     * @param r 原数组右边界
     */
    public static void merge_sort(int[] nums, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = l + r >> 1;
        int tmp[] = new int[nums.length];

        merge_sort(nums, l, mid);
        merge_sort(nums, mid + 1, r);

        int k = 0, i = l, j = mid + 1;

        while (i <= mid && j <= r) {
            if (nums[i] < nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            tmp[k++] = nums[i++];
        }

        while (j <= r) {
            tmp[k++] = nums[j++];
        }

        for (i = l, j = 0; i <= r; i++, j++) {
            nums[i] = tmp[j];
        }
    }

    /**
     * 冒泡排序
     * 原数组
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) { // 有 n 个数就比较 n - 1 次
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
            }
        }
    }

    /**
     * 快速排序
     * @param nums 原数组
     * @param l 原数组左边界
     * @param r 原数组右边界
     */
    public static void quick_sort(int nums[], int l, int r) {
        if (l == r) {
            return;
        }

        int i = l - 1, j = r + 1, x = nums[l + r >> 1];

        while (i < j) {
            while (nums[++i] < x);
            while (nums[--j] > x);

            if (i < j) {
                nums[i] ^= nums[j];
                nums[j] ^= nums[i];
                nums[i] ^= nums[j];
            }
        }

        quick_sort(nums, l, j);
        quick_sort(nums, j + 1, r);
    }
}
