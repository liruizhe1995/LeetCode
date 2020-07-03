class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1], 0) + nums[i];
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}


/*
Greedy

DP:
1. Divide and Conquer (subproblem)
    max_sum(i) = Max(max_sum(i-1), 0) + a[i]
2. 状态数组定义: f[i]
3. DP方程: f[i] = Max(f[i-1], 0) + a[i]

最大子序和 = 当前元素自身最大， 或者包含之前后最大
*/
