class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length-1;
        while (i < j) {
            int area = (j-i) * Math.min(height[i],height[j]);
            res = Math.max(area,res);
            if (height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}

// 一个指针从头开始，一个指针从尾部开始， 那个指针的柱子矮就往中间靠一格
