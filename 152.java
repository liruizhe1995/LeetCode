class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dpmax = new int[n];
        int[] dpmin = new int[n];
        dpmax[0] = nums[0];
        dpmin[0] = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            dpmax[i] = Math.max(dpmin[i-1] * nums[i], Math.max(dpmax[i-1]*nums[i], nums[i]));
            dpmin[i] = Math.min(dpmin[i-1] * nums[i], Math.min(dpmax[i-1]*nums[i], nums[i]));
            max = Math.max(dpmax[i], max);
        }

        return max;
    }
}
