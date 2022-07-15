class Solution {
    int maxCount=0;
    int currentCount=0;
    public int maxAreaOfIsland(int[][] grid) {
       boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==false)
                {
                    currentCount=0;
                    solveIt(i,j,visited,grid);
                    if(currentCount>maxCount)
                    {
                        maxCount=currentCount;
                    }
                }
            }
        }
        return maxCount;
    }
    public void solveIt(int i,int j,boolean [][]visited,int[][]grid)
    {
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || visited[i][j]==true || grid[i][j]==0) // base Case Handling
        {
            return ;
        }
        
        visited[i][j]=true;
        currentCount++;
        solveIt(i-1,j,visited,grid); // up
        solveIt(i+1,j,visited,grid); // down
        solveIt(i,j+1,visited,grid); //right
        solveIt(i,j-1,visited,grid); //left    
        
    }
}
