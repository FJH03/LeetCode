package No_448;

import java.util.*;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Solution_1
 * @Date: 2024/3/8
 * @Time: 17:15
 * @Description:找出所有数组中消失的数字
 */
class Solution_1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> L = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                L.add(i);
            }
        }

        return L;
    }
}
