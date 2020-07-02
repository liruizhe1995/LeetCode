class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) { //row
            for (int j = 0; j < grid[0].length; j++) { //col
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j-1];
                } else if (j == 0) {
                    grid[i][j] += grid[i-1][j];
                } else {
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}

/*

min[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j]

consider when i == 0 || j == 0 || (i == 0 && j == 0)

*/
