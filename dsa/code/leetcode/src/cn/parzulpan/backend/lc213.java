package cn.parzulpan.backend;

import java.util.Arrays;

/**
 * @author parzulpan
 * @since 2021/08/05
 */
public class lc213 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {8, 7, 1, 9, 3, 1};

        int rob = solution.rob(nums);
        System.out.println(rob);
        int rob2 = solution.rob(nums2);
        System.out.println(rob2);
        int rob3 = solution.rob(nums3);
        System.out.println(rob3);
    }

    static class Solution {
        public int rob(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                    myRob(Arrays.copyOfRange(nums, 1, nums.length)));
        }

        private int myRob(int[] nums) {
            int pre = 0, cur = 0, tmp;
            for (int num : nums) {
                tmp = cur;
                cur = Math.max(pre + num, cur);
                pre = tmp;
            }
            return cur;
        }
    }
}
