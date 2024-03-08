package No_1;

import java.util.HashMap;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution
 * @Date: 2024/3/8
 * @Time: 15:42
 * @Description:两数之和
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (m.get(another) != null) {
                result[0] = i;
                result[1] = m.get(another);
            } else {
                m.put(nums[i], i);
            }
        }

        return result;
    }
}