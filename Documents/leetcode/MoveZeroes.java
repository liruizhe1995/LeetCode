class Solution {
    public void moveZeroes(int[] nums) {
        // index j for pointing zeros
        int j = 0;
        //for loop
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                // swap 0 and non-zero
                nums[j] = nums[i];
                if (j != i){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}

// 1. loop count zeros,
// 2. 开新数组, loop， 一个指开头，一个指结尾
// 3. index ， 创建新下标j，j一直指0所在的index
// 4. swap, int temp