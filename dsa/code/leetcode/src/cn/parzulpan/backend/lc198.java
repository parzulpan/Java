package cn.parzulpan.backend;

/**
 * @author parzulpan
 * @since 2021/08/05
 */
public class lc198 {
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
            int prev = 0;
            int curr = 0;

            // 每次循环，计算“最多能白嫖的水果数”
            for (int i : nums) {
                // 循环开始时，curr 表示 dp[k-1]，prev 表示 dp[k-2]
                // dp[k] = max{ dp[k-1], dp[k-2] + i }
                int temp = Math.max(curr, prev + i);
                prev = curr;
                curr = temp;
                // 循环结束时，curr 表示 dp[k]，prev 表示 dp[k-1]
            }

            return curr;
        }
    }
}
